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
        Student student = new Student("Maciej Lewandowski");

        student.enrollInSubject(new Subject("Mathematics", 1));
        student.enrollInSubject(new Subject("History", 2));

        UniversityManager universityManager = new UniversityManager();
        universityManager.processEnrollment(student);

        student.addGrade(90.0);
        student.addGrade(85.5);

        student.processPayment(new BigDecimal("1500.00"));

        Professor professorSmith = new Professor("Sergey Zagriychuk");
        professorSmith.teachSubject(new Subject("Physics", 1));
        professorSmith.teachSubject(new Subject("Chemistry", 2));

        AcademicAdvisor advisorJohnson = new AcademicAdvisor("Johnson");
        advisorJohnson.provideCounseling(student);

        System.out.println("Professor Smith teaches: " + professorSmith.getTaughtSubjects());

        System.out.println("Advisor Johnson advises: " + advisorJohnson.getAdvisedStudents());

        UniversityUtils.calculateGPA(student);

        System.out.println("Total enrolled students: " + UniversityConfig.totalEnrolledStudents);

        System.out.println("University Name: " + UniversityConfig.UNIVERSITY_NAME);
    }
}
