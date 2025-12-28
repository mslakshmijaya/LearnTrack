package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    public static List<Course> courseList =new ArrayList<Course>();
    public static void addCourse(String courseName, String courseDescription, String courseDuration){
        Course course = new Course(courseName, courseDescription, courseDuration);
        courseList.add(course);
    }
    public static void displayCourseDetails(){
        System.out.println(" Course  list ");
        for(Course course:courseList){
            StringBuilder buufer = new StringBuilder();
            buufer.append(course.getId()).append("   ")
                    .append(course.getCourseName()).append("    ")
                    .append(course.getDescription()).append("       ")
                    .append(course.getDurationInWeeks()).append("     ")
                    .append(course.isActive());

            System.out.println(buufer.toString());
        }
    }
    public static void deactivateCourse(int courseId){
        for(Course course:courseList){
            if(course.getId()==courseId){
                course.setActive(false);
                return;
            }

        }
        System.out.println("Course not found");
    }
}
