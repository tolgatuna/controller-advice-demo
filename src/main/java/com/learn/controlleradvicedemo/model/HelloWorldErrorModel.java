package com.learn.controlleradvicedemo.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class HelloWorldErrorModel implements Serializable {
    private String message;
}
