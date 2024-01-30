package com.example.logreport.Repositories;
import com.example.logreport.Models.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface AdminRepository extends JpaRepository<Admin, Long> {
	    // Custom queries can be added here if needed
    	Admin findByUsernameAndPassword(String username, String password);

		Object findByUsername(String username);

	}

