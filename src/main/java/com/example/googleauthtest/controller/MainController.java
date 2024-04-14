package com.example.googleauthtest.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/public")
    public String homePage() {
        return "Hello from Spring boot app";
    }

    @GetMapping("/private")
    public Object privateRoute() {
//        System.out.println(CurrentAuthContext.getUserDetails().getEmail());
//        return CurrentAuthContext.getUserName();
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
