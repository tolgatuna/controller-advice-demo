package com.learn.controlleradvicedemo.advice;

import com.learn.controlleradvicedemo.exception.NotFoundException;
import com.learn.controlleradvicedemo.exception.OperationFailException;
import com.learn.controlleradvicedemo.model.HelloWorldErrorModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class HelloWorldControllerAdvice {

    @ExceptionHandler(value = NotFoundException.class)
    protected ResponseEntity<HelloWorldErrorModel> handleNotFoundException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(
                        HelloWorldErrorModel.builder()
                                .message(ex.getMessage())
                                .build()
                );
    }

    @ExceptionHandler(value = OperationFailException.class)
    protected ResponseEntity<HelloWorldErrorModel> handleOperationFailException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY)
                .body(
                        HelloWorldErrorModel.builder()
                                .message(ex.getMessage())
                                .build()
                );
    }

    @ExceptionHandler(value = Exception.class)
    protected ResponseEntity<HelloWorldErrorModel> handleAllExceptions(Exception ex) {
        log.error("Error From UnKnown Exception -> {}", ex.getClass());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(
                        HelloWorldErrorModel.builder()
                                .message(ex.getMessage())
                                .build()
                );
    }

}
