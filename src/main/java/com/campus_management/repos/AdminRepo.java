package com.campus_management.repos;

import com.campus_management.models.AdminModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepo extends MongoRepository<AdminModel, String> {
}
