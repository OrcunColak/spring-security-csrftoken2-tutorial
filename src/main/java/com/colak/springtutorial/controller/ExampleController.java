package com.colak.springtutorial.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @PostMapping(path = "white")
    public String postWhite(HttpServletRequest request) {
        return "Post request to white page succeeded";
    }

    // http://localhost:8080/example/csrf
    @GetMapping(path = "csrf")
    public String getTest(HttpServletRequest request) {
        CsrfToken csrf = (CsrfToken) request.getAttribute("_csrf");
        return "CSRF Token: " + csrf.getToken();
    }

    @PostMapping("/submit")
    public String processForm() {
        return "success";
    }
}
