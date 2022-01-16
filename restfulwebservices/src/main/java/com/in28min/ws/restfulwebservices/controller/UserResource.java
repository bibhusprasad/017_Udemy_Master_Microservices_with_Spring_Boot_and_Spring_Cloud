package com.in28min.ws.restfulwebservices.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28min.ws.restfulwebservices.bean.User;
import com.in28min.ws.restfulwebservices.exception.UserNotFoundException;
import com.in28min.ws.restfulwebservices.service.UserDaoService;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return this.service.findAll();
    }

    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable final int id) {
        final User user = this.service.findOne(id);
        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }

        final EntityModel<User> userModel = EntityModel.of(user);
        final WebMvcLinkBuilder linkBuilder = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        userModel.add(linkBuilder.withRel("all-users"));
        return userModel;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable final int id) {
        final User user = this.service.deleteById(id);

        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }
    }

    //
    // input - details of user
    // output - CREATED & Return the created URI
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody final User user) {
        final User savedUser = this.service.save(user);
        // CREATED
        // /user/{id}     savedUser.getId()

        final URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

}
