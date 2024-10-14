package com.campus_management.service;

import com.campus_management.models.TimetableModel;
import com.campus_management.repos.TimetableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimetableService {

    @Autowired
    private TimetableRepo timetableRepo;

    public TimetableModel getTimetable(String department, String semester) {
        return timetableRepo.findAll().stream()
                .filter(timetable -> department.equals(timetable.getDepartment()) && semester.equals(timetable.getSemester()))
                .findFirst()
                .orElse(null);
    }

    public void updateTimetable(TimetableModel timetableData) {
        TimetableModel timetable = timetableRepo.findById(timetableData.get_id()).orElse(null);
        if (timetable != null) {
            timetable.setTimetableUrl(timetableData.getTimetableUrl());
            timetableRepo.save(timetable);
        } else {
            timetableRepo.save(timetableData);
        }
    }

    public void deleteTimetable(String id) {
        timetableRepo.deleteById(id);
    }

    public List<TimetableModel> getAllTimetables() {
        return timetableRepo.findAll();
    }
}
