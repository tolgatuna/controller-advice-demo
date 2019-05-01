package com.learn.controlleradvicedemo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloWorldModel {
    private String message;
}
