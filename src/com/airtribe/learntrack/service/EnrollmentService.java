package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.util.EnumHelperClass;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {
    private static List<Enrollment> enrollmentList = new ArrayList<Enrollment>();

    public static void getEnrollments() {
        System.out.println(" All Enrollment  list ");

        for (Enrollment enrollment : enrollmentList) {
            StringBuilder buffer = new StringBuilder();
            buffer.append(enrollment.getId()).append(" ")
                    .append(enrollment.getStudentId()).append(" ")
                    .append(enrollment.getCourseId()).append("   ")
                    .append(enrollment.getEnrollmentDate()).append(" ")
                    .append(enrollment.getStatus());

            System.out.println(buffer.toString());
        }
    }

    public static void addEnrollment(int studentId, int courseId) throws EntityNotFoundException {

        Enrollment enrollment = new Enrollment(studentId, courseId);
        List<Student> studentList = StudentService.studentList;
        List<Course> courseList = CourseService.courseList;
        boolean studentExists = false, courseExists = false;
        for (Student student : studentList) {
            if ((student.getId()) == studentId) {
                studentExists = true;
                break;
            }

        }
        for (Course course : courseList) {
            if ((course.getId()) == courseId) {
                courseExists = true;
                break;
            }
        }
        if (studentExists && courseExists) {
            enrollmentList.add(enrollment);
        } else {
            throw new EntityNotFoundException("Student or Course not found");
        }


    }

    public static void markEnrollment(int id) {

        for (Enrollment enrollment : enrollmentList) {
            if (enrollment.getId() == id) {
                enrollment.setStatus(String.valueOf(EnumHelperClass.CANCELLED));
                return;
            }
        }
        System.out.println("cancel enrollment failed  with id " + id);
    }

}
