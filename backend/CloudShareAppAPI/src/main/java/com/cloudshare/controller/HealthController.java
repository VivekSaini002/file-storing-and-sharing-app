package com.cloudshare.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping
    public String healthCheck() {
        return "Application is up and running - v1.0";
    }
}
