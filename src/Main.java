import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.exception.InvalidInputException;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.EnrollmentService;
import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.util.inputValidator;

import java.util.Scanner;

public class Main {

    static void displayMenu() {
        System.out.println("----- MENU -------");
        System.out.println("::::::: Student Management System :::::::-");
        System.out.println("----- 1.Add a student -------");
        System.out.println("----- 2.View a student details -------");
        System.out.println("----- 3.Deactivate a student -------");
        System.out.println("----- 4.Search Student by ID -------");
        System.out.println("::::::: Course Management System :::::::-");
        System.out.println("----- 5.Add a course -------");
        System.out.println("----- 6.View a course details -------");
        System.out.println("----- 7.Activate/Deactivate a course -------");
        System.out.println("::::::: Enrollment  Management System :::::::-");
        System.out.println("----- 8.Enroll a student for course -------");
        System.out.println("----- 9.View a Enrollment details -------");
        System.out.println("----- 10.Mark Enrollment as Cancelled -------");
        System.out.println("----- 11. Exit the Menu  -------");
        System.out.print("Enter your choice: ");
    }

    static void addStudent() {
        System.out.println("-----Please enter  Student details  -------");
        Scanner input = new Scanner(System.in);
        System.out.println(" first name : ");
        String firstName = input.nextLine().trim();
        System.out.println(" last name : ");
        String lastName = input.nextLine().trim();
        System.out.println(" email : ");
        String email = input.nextLine().trim();
        boolean isValidEmail = inputValidator.isValidEmail(email);
        if (!isValidEmail) {
            System.out.println(" email is not valid ");
            return;

        } else {
            StudentService.addStudent(firstName, lastName, email);
        }
    }

    static void addCourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Please enter Course details -------");
        System.out.println(" course name : ");
        String courseName = input.nextLine().trim();
        System.out.println(" description : ");
        String description = input.nextLine().trim();
        System.out.println(" duration in weeks : ");
        int duration = input.nextInt();
        CourseService.addCourse(courseName, description, duration);
    }

    static void enrollStudent() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(" Student ID : ");
            long studentId = input.nextLong();
            System.out.println(" course ID : ");
            long courseId = input.nextLong();
            EnrollmentService.addEnrollment(studentId, courseId);
        } catch (EntityNotFoundException e) {
            System.out.println(" Not a Valid Student ID or course ID or both ");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exitMenu = true;
        try {
            while (exitMenu) {

                displayMenu();
                int i = input.nextInt();
                switch (i) {
                    case 1 -> addStudent();
                    case 2 -> StudentService.listStudents();
                    case 3 -> {
                        System.out.println("----- enter student id to deactivate -------");
                        int id = input.nextInt();
                        StudentService.deactivateStudent(id);
                    }
                    case 4 -> {
                        System.out.println("----- search student by ID -------");
                        int id = input.nextInt();
                        StudentService.searchStudentById(id);
                    }
                    case 5 -> addCourse();
                    case 6 -> CourseService.displayCourseDetails();
                    case 7 -> {
                        System.out.println("----- enter course Id to deactivate -------");
                        CourseService.deactivateCourse(input.nextInt());
                    }
                    case 8 -> enrollStudent();
                    case 9 -> EnrollmentService.getEnrollments();
                    case 10 -> {
                        System.out.println(" Enrollment ID : ");
                        int id = input.nextInt();
                        EnrollmentService.markEnrollment(id);
                    }
                    case 11 -> exitMenu = false;
                    default -> throw new InvalidInputException("Please enter a valid option!");
                }

            }
            System.out.println("Thanks you visit again");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

}

