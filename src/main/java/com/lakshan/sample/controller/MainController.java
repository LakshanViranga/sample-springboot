package com.lakshan.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lakshan
 * @since 9/15/2021 11:24 AM
 */

@RestController
public class MainController {

    @GetMapping("/")
    public String get(){
        return "Hello world";
    }
}
