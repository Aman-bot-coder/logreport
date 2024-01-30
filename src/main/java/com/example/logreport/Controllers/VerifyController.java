package com.example.logreport.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.logreport.Models.Admin;
import com.example.logreport.Services.VerifyService;

@RestController
@RequestMapping("/admin")
public class VerifyController {

    @Autowired
    private VerifyService verifyService;

    @PostMapping("/verify")
    public String login(@RequestBody Admin admin) {
        if (verifyService.isValidAdmin(admin.getUsername(), admin.getPassword())) {
            return "You're a verified Admin";
        } else {
            return "Invalid credentials";
        }
    }
}
