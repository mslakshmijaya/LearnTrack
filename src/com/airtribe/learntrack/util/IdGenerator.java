package com.airtribe.learntrack.util;

public class IdGenerator {
    private static int studentIdCounter = 100;
    private static int courseCounter = 200;
    private static int enrollmentCounter = 300;

    public static int getNextStudentId() {
        return ++studentIdCounter;
    }
    public static int getNextCourseId() {
        return ++courseCounter;
    }
    public static int getNextEnrollmentId() {
        return ++enrollmentCounter;
    }
}
