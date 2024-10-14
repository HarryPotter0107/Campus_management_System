package com.campus_management.service;

import com.campus_management.models.StudentModel;
import com.campus_management.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentModel addStudent(StudentModel studentData) {
        studentData.setUsertype("student");
        return studentRepo.save(studentData);
    }

    public StudentModel updateStudent(StudentModel studentData) {
        return studentRepo.save(studentData);
    }

    public void deleteStudent(String id) {
        studentRepo.deleteById(id);
    }

    public StudentModel getStudentById(String id) {
        return studentRepo.findById(id).orElse(null);
    }

    public List<StudentModel> getAllStudents() {
        return studentRepo.findAll();
    }
}
