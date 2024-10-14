package com.campus_management.repos;

import com.campus_management.models.FacultyModel;
import com.campus_management.models.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface StudentRepo extends MongoRepository<StudentModel, String> {
    @Query(value = "{ 'studentId': ?0 }")
    StudentModel findByStudentId(String studentId);
}
