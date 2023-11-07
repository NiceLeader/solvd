package homework2;

import homework2.university.UniversityConfig;
import homework2.university.UniversityManager;
import homework2.university.UniversityUtils;

import java.math.BigDecimal;

public class UniversitySystemMain {

    static {
        UniversityConfig.initialize();
    }

    public static void main(String[] args) {
        // Create a new Student
        Student student = new Student("Maciej Lewandowski");

        // Enroll the student in subjects
        student.enrollInSubject(new Subject("Mathematics", 1));
        student.enrollInSubject(new Subject("History", 2));

        // Process the enrollment using polymorphism
        UniversityManager universityManager = new UniversityManager();
        universityManager.processEnrollment(student);

        // Add grades to the student using the Evaluatable interface
        student.addGrade(90.0);
        student.addGrade(85.5);

        // Handle payments
        student.processPayment(new BigDecimal("1500.00"));

        Professor professorSmith = new Professor("Sergey Zagriychuk");
        professorSmith.teachSubject(new Subject("Physics", 1));
        professorSmith.teachSubject(new Subject("Chemistry", 2));

        // Create an AcademicAdvisor and have them counsel students
        AcademicAdvisor advisorJohnson = new AcademicAdvisor("Johnson");
        advisorJohnson.provideCounseling(student); // Assuming 'student' is already created as shown in previous snippets

        // Display taught subjects by Professor Smith
        System.out.println("Professor Smith teaches: " + professorSmith.getTaughtSubjects());

        // Display advised students by Advisor Johnson
        System.out.println("Advisor Johnson advises: " + advisorJohnson.getAdvisedStudents());

        // Use the static method to calculate GPA
        UniversityUtils.calculateGPA(student);

        // Output the total number of enrolled students using the static variable
        System.out.println("Total enrolled students: " + UniversityConfig.totalEnrolledStudents);

        // Demonstrate final variable usage
        System.out.println("University Name: " + UniversityConfig.UNIVERSITY_NAME);
    }
}
