package com.in28min.ws.restfulwebservices.versioning;

public class PersonV1 {

    private String name;

    public PersonV1() {
        super();
    }

    public PersonV1(final String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
