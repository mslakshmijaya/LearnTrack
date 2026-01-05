package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    public static List<Course> courseList = new ArrayList<Course>();

    public static void addCourse(String courseName, String courseDescription, int courseDuration) {
        Course course = new Course(courseName, courseDescription, courseDuration);
        courseList.add(course);
    }

    public static void displayCourseDetails() {
        System.out.println(" Course  list ");
        for (Course course : courseList) {
            StringBuilder buufer = new StringBuilder();
            buufer.append(course.getId()).append("   ")
                    .append(course.getCourseName()).append("    ")
                    .append(course.getDescription()).append("       ")
                    .append(course.getDurationInWeeks()).append("     ")
                    .append(course.isActive());

            System.out.println(buufer.toString());
            return;
        }
        System.out.println("No course found");
    }

    public static void deactivateCourse(int courseId) {
        for (Course course : courseList) {
            if (course.getId() == courseId) {
                course.setActive(false);
                return;
            }

        }

        try {
            throw new EntityNotFoundException("Course not found");
        } catch (EntityNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
