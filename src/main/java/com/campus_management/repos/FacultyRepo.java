package com.campus_management.repos;

import com.campus_management.models.FacultyModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FacultyRepo extends MongoRepository<FacultyModel, String> {
    @Query(value = "{ 'employeeId': ?0 }")
    FacultyModel findByEmployeeId(String employeeId);
}
