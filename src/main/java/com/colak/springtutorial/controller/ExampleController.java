package com.colak.springtutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {

    // http://localhost:8080/index.html
    // Submit button is giving 403 now
    @PostMapping("/submit")
    public String processForm() {
        return "success";
    }
}
