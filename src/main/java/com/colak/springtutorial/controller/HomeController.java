package com.colak.springtutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        // This will return the Thymeleaf template "index.html" located in src/main/resources/templates
        return "index";
    }
}

