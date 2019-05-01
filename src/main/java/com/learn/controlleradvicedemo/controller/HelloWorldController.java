package com.learn.controlleradvicedemo.controller;

import com.learn.controlleradvicedemo.exception.NotFoundException;
import com.learn.controlleradvicedemo.exception.OperationFailException;
import com.learn.controlleradvicedemo.model.HelloWorldModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class HelloWorldController {

    @GetMapping(path = "success")
    public HelloWorldModel getHelloWorldMessage() {
        return HelloWorldModel.builder().message("Hello World").build();
    }

    @GetMapping(path = "not-found")
    public HelloWorldModel throwNotFoundException() {
        throw new NotFoundException("Not Found Hello World");
    }

    @GetMapping(path = "operation-fail")
    public HelloWorldModel throwOperationFailException() {
        throw new OperationFailException("Operation Fail Exception!");
    }

    @GetMapping(path = "fail")
    public HelloWorldModel throwRandomException() {
        String x = null;
        x.getBytes();
        return HelloWorldModel.builder().build();
    }
}
