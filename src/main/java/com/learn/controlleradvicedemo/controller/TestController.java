package com.learn.controlleradvicedemo.controller;

import com.learn.controlleradvicedemo.exception.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping(value = "test")
    public String test() {
        throw new NotFoundException("Cino Not FOUND!");
    }

}
