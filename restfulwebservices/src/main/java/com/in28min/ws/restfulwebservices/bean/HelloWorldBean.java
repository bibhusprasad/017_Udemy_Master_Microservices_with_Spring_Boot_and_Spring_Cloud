package com.in28min.ws.restfulwebservices.bean;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBean [message=%s]", this.message);
    }

}
