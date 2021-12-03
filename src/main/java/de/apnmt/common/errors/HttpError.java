package de.apnmt.common.errors;

import org.zalando.problem.Status;

public class HttpError extends RuntimeException {

    private static final long serialVersionUID = 2791155249461313030L;

    private final Status status;

    private final String key;

    private final String message;

    public HttpError(Status status, String key, String message) {
        super(message);
        this.status = status;
        this.key = key;
        this.message = message;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getKey() {
        return this.key;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
