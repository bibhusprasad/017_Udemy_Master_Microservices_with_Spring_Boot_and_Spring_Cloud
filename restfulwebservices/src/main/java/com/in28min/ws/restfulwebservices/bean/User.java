package com.in28min.ws.restfulwebservices.bean;

import java.util.Date;

public class User {

    private Integer id;

    private String name;

    private Date birthDate;

    public User() {
        
    }

    public User(final Integer id, final String name, final Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(final Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("User [id=%s, name=%s, birthDate=%s]", this.id, this.name, this.birthDate);
    }
}
