package com.example.logreport.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.logreport.Models.Admin;
import com.example.logreport.Repositories.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin createAdmin(String username, String password) {
        // Check if the username is already taken (optional, depending on your requirements)
        if (adminRepository.findByUsername(username) != null) {
            throw new RuntimeException("Username already exists. Please choose a different one.");
        }

        // Create a new Admin entity
        Admin newAdmin = new Admin(username, password);

        // Save the newAdmin to the database
        return adminRepository.save(newAdmin);
    }
}

