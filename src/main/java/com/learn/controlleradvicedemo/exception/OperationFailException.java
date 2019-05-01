package com.learn.controlleradvicedemo.exception;

public class OperationFailException extends RuntimeException {
    public OperationFailException() {
        super();
    }

    public OperationFailException(String message) {
        super(message);
    }

    public OperationFailException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationFailException(Throwable cause) {
        super(cause);
    }

    protected OperationFailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
