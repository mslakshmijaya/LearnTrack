package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.util.EnrollmentStatus;
import com.airtribe.learntrack.util.IdGenerator;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Enrollment {
    private LocalDate enrollmentDate;
    private EnrollmentStatus status;
    private int id;
    private long studentId;
    private long courseId;

    public Enrollment(long studentId, long courseId) {

        this.id = IdGenerator.getNextEnrollmentId();
        this.studentId = studentId;
        this.courseId = courseId;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.enrollmentDate = LocalDate.now();
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

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }
}
