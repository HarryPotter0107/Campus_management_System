package com.campus_management.models;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "timetables")
public class TimetableModel {

    public String _id;
    public String department;
    public String semester;
    public String timetableUrl;

    public TimetableModel() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getTimetableUrl() {
        return timetableUrl;
    }

    public void setTimetableUrl(String timetableUrl) {
        this.timetableUrl = timetableUrl;
    }

    @Override
    public String toString() {
        return "TimetableModel{" +
                "_id='" + _id + '\'' +
                ", department='" + department + '\'' +
                ", semester='" + semester + '\'' +
                ", timetableUrl='" + timetableUrl + '\'' +
                '}';
    }



}
