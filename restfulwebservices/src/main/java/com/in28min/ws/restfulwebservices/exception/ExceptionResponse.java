package com.in28min.ws.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {

    private final Date timestamp;
    private final String message;
    private final String details;

    public ExceptionResponse(final Date timestamp, final String message, final String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public String getDetails() {
        return this.details;
    }

}
