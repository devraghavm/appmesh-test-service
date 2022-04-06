package com.dish.appmeshtestservice.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
public class GreetingModel {
    private final Date currentTime;
    private final String apiVersion;
    private final String greeting;
}
