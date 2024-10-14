package com.campus_management.service;

import com.campus_management.models.SubjectModel;
import com.campus_management.repos.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    public SubjectModel addSubject(SubjectModel subjectData) {
        return subjectRepo.save(subjectData);
    }

    public void removeSubject(String id, String semester) {
        SubjectModel subjectDoc = subjectRepo.findById(id).orElse(null);
        if (subjectDoc != null) {
            subjectDoc.getSubjects().remove(semester);
            subjectRepo.save(subjectDoc);
        }
    }

    public SubjectModel getSubject(String department, String semester) {
        return subjectRepo.findAll().stream()
                .filter(subject -> department.equals(subject.getDepartment()) && semester.equals(subject.getSemester()))
                .findFirst()
                .orElse(null);
    }

    public List<SubjectModel> getAllSubjects() {
        return subjectRepo.findAll();
    }
}
