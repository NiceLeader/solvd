package homework2;

import homework2.exception.EnrollmentException;
import homework2.exception.InvalidAmountException;
import homework2.exception.InvalidDiscountException;
import homework2.person.AcademicAdvisor;
import homework2.person.Professor;
import homework2.person.Student;
import homework2.university.University;
import homework2.university.UniversityConfig;
import homework2.university.UniversityManager;
import homework2.university.UniversityUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static homework2.person.Student.studentsToString;
import static homework2.Subject.subjectsToString;

public class UniversitySystemMain {

    private static final Logger LOGGER = Logger.getLogger(UniversitySystemMain.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("UniversitySystemMain.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (Exception e) {
            System.err.println("Failed to initialize logger file handler: " + e.getMessage());
        }

        LOGGER.info("Initializing University System...");
        UniversityConfig.initialize();
        LOGGER.info("University System Initialized.");
    }

    public static void main(String[] args) throws EnrollmentException {
        University university = new University();
        university.setName("North Carolina State University");
        university.setAddress("123 Innovation Drive, Techville");
        Faculty engineeringFaculty = new Faculty("Engineering");

        Student student = new Student("Maciej Lewandowski");
        student.setFaculty(engineeringFaculty);
        Subject subjectMath = new Subject("Mathematics", 1);

        student.enrollInSubject(subjectMath);

        UniversityManager universityManager = new UniversityManager();
        universityManager.processEnrollment(student);

        student.addGrade(90.0);
        student.addGrade(85.5);
        student.calculateAndPrintGPA();

        student.processPayment(new BigDecimal("1500.00"));

        Cost studentCost = null;
        try {
            studentCost = new Cost(10000.0, 1500.0);
        } catch (InvalidAmountException e) {
            throw new RuntimeException(e);
        }

        double totalCost = studentCost.calculateTotalCost();
        LOGGER.info("Total cost for the semester: $" + totalCost);

        double scholarshipAmount = 2500.0;
        double adjustedTuition = 0;
        try {
            adjustedTuition = studentCost.applyScholarship(scholarshipAmount);
        } catch (InvalidAmountException e) {
            throw new RuntimeException(e);
        }
        LOGGER.info("Adjusted tuition after scholarship: $" + adjustedTuition);

        double discountPercentage = 10.0;
        double discountedTuition = 0;
        try {
            discountedTuition = studentCost.applyDiscount(discountPercentage);
        } catch (InvalidDiscountException e) {
            throw new RuntimeException(e);
        }
        LOGGER.info("Discounted tuition: $" + discountedTuition);


        String costBreakdown = studentCost.getCostBreakdown();
        LOGGER.info("Cost breakdown:\n" + costBreakdown);

        Professor professorSergey = new Professor();
        professorSergey.teachSubject(subjectMath);
        professorSergey.getRole();
        professorSergey.setName("Sergey Zagriychuk");

        professorSergey.printSubjectsTaught();

        AcademicAdvisor advisorJohnson = new AcademicAdvisor();
        advisorJohnson.provideCounseling(student);
        advisorJohnson.printAdvisedStudents();
        advisorJohnson.setName("Johnson");

        LOGGER.info(student.toString());
        LOGGER.info("Professor Sergey teaches: " + subjectsToString(professorSergey.getTaughtSubjects()));
        LOGGER.info("Advisor Johnson advises: " + studentsToString(advisorJohnson.getAdvisedStudents()));

        LOGGER.info("Professor Sergey teaches: " + subjectsToString(new ArrayList<>(professorSergey.getTaughtSubjects())));
        LOGGER.info("Advisor Johnson advises: " + studentsToString(new ArrayList<>(advisorJohnson.getAdvisedStudents())));


        UniversityUtils.calculateGPA(student);

        LOGGER.info("Total enrolled students: " + UniversityConfig.totalEnrolledStudents);
        LOGGER.info("University Name: " + UniversityConfig.UNIVERSITY_NAME);
    }
}
