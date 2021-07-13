package com.example.blooddonar.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/test1")
    ResponseEntity<String> test1(){
        return new ResponseEntity<String>("Application is running.", HttpStatus.OK);
    }
}

