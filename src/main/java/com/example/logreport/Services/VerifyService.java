package com.example.logreport.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.logreport.Repositories.AdminRepository;

@Service
public class VerifyService {

    @Autowired
    private AdminRepository adminRepository;

    public boolean isValidAdmin(String username, String password) {
        com.example.logreport.Models.Admin admin = adminRepository.findByUsernameAndPassword(username, password);
        return admin != null;
    }
}
