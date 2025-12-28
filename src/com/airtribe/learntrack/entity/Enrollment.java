package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.util.EnumHelperClass;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.Date;

public class Enrollment {
    private String enrollmentDate, status;
    private int id, studentId, courseId;

    public Enrollment(int studentId, int courseId) {

        this.id = IdGenerator.getNextEnrollmentId();
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = new Date().toString();
        this.status = String.valueOf(EnumHelperClass.ACTIVE);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
