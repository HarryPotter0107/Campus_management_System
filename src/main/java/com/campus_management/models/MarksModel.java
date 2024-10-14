package com.campus_management.models;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "marks")
public class MarksModel {

    public String _id;
    public String examType;
    public String semester;
    public String department;
    public String subject;
    public Object marks;

    public MarksModel() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Object getMarks() {
        return marks;
    }

    public void setMarks(Object marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "MarksModel{" +
                "_id='" + _id + '\'' +
                ", examType='" + examType + '\'' +
                ", semester='" + semester + '\'' +
                ", department='" + department + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
