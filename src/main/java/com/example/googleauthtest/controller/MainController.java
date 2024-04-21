package com.example.googleauthtest.controller;


import com.example.googleauthtest.model.CityDetail;
import com.example.googleauthtest.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    MainService mainService;
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

    @GetMapping("/city/{id}")
    public CityDetail cityDetail(@PathVariable int id) {

        CityDetail cityDetail = null;
        try {
            cityDetail = mainService.getCity(id);
            return cityDetail;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
