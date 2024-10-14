package com.campus_management.service;

import com.campus_management.models.FacultyModel;
import com.campus_management.repos.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepo facultyRepo;

    public FacultyModel addFaculty(FacultyModel facultyData) {
        facultyData.setUsertype("faculty");
        return facultyRepo.save(facultyData);
    }

    public FacultyModel updateFaculty(FacultyModel facultyData) {
        return facultyRepo.save(facultyData);
    }

    public void deleteFaculty(String id) {
        facultyRepo.deleteById(id);
    }

    public FacultyModel getFacultyById(String id) {
        return facultyRepo.findById(id).orElse(null);
    }

    public List<FacultyModel> getAllFaculty() {
        return facultyRepo.findAll();
    }
}
