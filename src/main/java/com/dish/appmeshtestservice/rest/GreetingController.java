package com.dish.appmeshtestservice.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/hello")
public class GreetingController {
    @GetMapping
    public ResponseEntity<?> sayHello() {
        String version = "v2";
        String greeting = String.format("Hello Team From %s.", version);
        return new ResponseEntity<>(new GreetingModel(new Date(), version, greeting), HttpStatus.OK);
    }
}
