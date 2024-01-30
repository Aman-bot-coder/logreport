package com.example.logreport.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.logreport.Models.Admin;
import com.example.logreport.Services.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/createAdmin")
    public ResponseEntity<String> createAdmin(@RequestBody Admin admin) {
        try {
            adminService.createAdmin(admin.getUsername(), admin.getPassword());
            return ResponseEntity.ok("Admin created successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to create admin: " + e.getMessage());
        }
   
    }
}
