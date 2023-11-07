package homework2;

import homework2.university.University;
import homework2.university.UniversityConfig;
import homework2.university.UniversityManager;
import homework2.university.UniversityUtils;

import java.math.BigDecimal;

public class UniversitySystemMain {

    static {
        System.out.println("Initializing University System...");
        UniversityConfig.initialize();
        System.out.println("University System Initialized.");
    }

    public static void main(String[] args) {
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

        Cost studentCost = new Cost(10000.0, 1500.0);

        double totalCost = studentCost.calculateTotalCost();
        System.out.println("Total cost for the semester: $" + totalCost);

        double scholarshipAmount = 2500.0;
        double adjustedTuition = studentCost.applyScholarship(scholarshipAmount);
        System.out.println("Adjusted tuition after scholarship: $" + adjustedTuition);

        double discountPercentage = 10.0;
        double discountedTuition = studentCost.applyDiscount(discountPercentage);
        System.out.println("Discounted tuition: $" + discountedTuition);

        String costBreakdown = studentCost.getCostBreakdown();
        System.out.println("Cost breakdown:\n" + costBreakdown);

        Professor professorSergey = new Professor("Sergey Zagriychuk");
        professorSergey.teachSubject(subjectMath);

        professorSergey.printSubjectsTaught();


        AcademicAdvisor advisorJohnson = new AcademicAdvisor("Johnson");
        advisorJohnson.provideCounseling(student);
        advisorJohnson.printAdvisedStudents();

        System.out.println(student);
        System.out.println("Professor Sergey teaches: " + professorSergey.getTaughtSubjects());
        System.out.println("Advisor Johnson advises: " + advisorJohnson.getAdvisedStudents());

        UniversityUtils.calculateGPA(student);

        System.out.println("Total enrolled students: " + UniversityConfig.totalEnrolledStudents);

        System.out.println("University Name: " + UniversityConfig.UNIVERSITY_NAME);
    }
}
