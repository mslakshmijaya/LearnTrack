package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.util.EnrollmentStatus;
import com.airtribe.learntrack.util.IdGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Enrollment {
    private String enrollmentDate;
    private EnrollmentStatus status;
    private int id;
    private long studentId;
    private long courseId;

    public Enrollment(long studentId, long courseId) {

        this.id = IdGenerator.getNextEnrollmentId();
        this.studentId = studentId;
        this.courseId = courseId;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.enrollmentDate = sdf.format(new Date());
        this.status = EnrollmentStatus.ACTIVE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }
}
