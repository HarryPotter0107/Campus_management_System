package com.campus_management.models;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Getter
@Document(collection = "subjects")
public class SubjectModel {

    public String _id;
    public String department;
    public String semester;
    public List<String> subjects;

    public SubjectModel() {
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "SubjectModel{" +
                "_id='" + _id + '\'' +
                ", department='" + department + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
