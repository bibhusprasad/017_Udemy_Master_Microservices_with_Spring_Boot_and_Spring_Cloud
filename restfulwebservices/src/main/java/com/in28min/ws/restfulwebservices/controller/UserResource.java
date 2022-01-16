package com.in28min.ws.restfulwebservices.controller;

import com.in28min.ws.restfulwebservices.bean.User;
import com.in28min.ws.restfulwebservices.exception.UserNotFoundException;
import com.in28min.ws.restfulwebservices.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return this.service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable final int id) {
        final User user = this.service.findOne(id);

        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }

        return user;
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
