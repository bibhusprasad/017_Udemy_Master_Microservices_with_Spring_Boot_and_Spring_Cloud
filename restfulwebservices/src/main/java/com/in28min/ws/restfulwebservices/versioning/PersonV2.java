package com.in28min.ws.restfulwebservices.versioning;

public class PersonV2 {

    private Name name;

    public PersonV2() {
        super();
    }

    public PersonV2(final Name name) {
        super();
        this.name = name;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(final Name name) {
        this.name = name;
    }

}
