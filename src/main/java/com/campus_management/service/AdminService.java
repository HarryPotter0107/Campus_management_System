package com.campus_management.service;

import com.campus_management.models.AdminModel;
import com.campus_management.repos.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public AdminModel registerAdmin(AdminModel adminData) {
        adminData.setUsertype("admin");
        return adminRepo.save(adminData);
    }

    // Add more methods as needed
}
