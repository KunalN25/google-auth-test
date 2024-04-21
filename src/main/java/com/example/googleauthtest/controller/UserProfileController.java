package com.example.googleauthtest.controller;


import com.example.googleauthtest.model.UserProfile;
import com.example.googleauthtest.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserProfileController {
    @Autowired
    MainService mainService;

    @GetMapping("/profile")
    public UserProfile userProfile(@RequestParam String email) {
        return mainService.getUserProfile(email);
    }

    @PostMapping("/addProfile")
    public String addProfile() {
        try {
            mainService.addProfile();
            return "Success";
        } catch (Exception e){
            return "Error";
        }
    }
}
