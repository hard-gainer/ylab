package org.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidIdTypeException extends RuntimeException {
    public InvalidIdTypeException() {
        super();
    }

    public InvalidIdTypeException(String message) {
        super(message);
    }

    public InvalidIdTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIdTypeException(Throwable cause) {
        super(cause);
    }

    protected InvalidIdTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
