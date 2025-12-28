package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static List<Student> studentList = new ArrayList<Student>();

    public static void addStudent(String firstName, String lastName, String email) {
        Student student = new Student(firstName, lastName, email);
        studentList.add(student);
    }

    public static void listStudents() {
        System.out.println(" student list ");
        for (Student s : studentList) {
            StringBuilder buffer = new StringBuilder();
            buffer.append(s.getId()).append("     ")
                    .append(s.getFirstName()).append("            ")
                    .append(s.getLastName()).append("          ")
                    .append(s.getEmail()).append("       ")
                    .append(s.isActive());

            System.out.println(buffer.toString());
            return;
        }
        System.out.println("No course found");

    }

    public static void deactivateStudent(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                s.setActive(false);
                return;
            }
        }
        System.out.println("Student Id not found to deactivate");
    }

    public static void searchStudentById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                StringBuilder buffer = new StringBuilder();
                buffer.append(s.getId()).append("     ")
                        .append(s.getFirstName()).append("            ")
                        .append(s.getLastName()).append("          ")
                        .append(s.getEmail()).append("       ")
                        .append(s.isActive());

                System.out.println(buffer.toString());
                return;
            }

        }
        System.out.println("Student id not found");
    }

}
