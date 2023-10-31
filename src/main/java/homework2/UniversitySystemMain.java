package homework2;

import java.util.Date;

public class UniversitySystemMain {
    public static void main(String[] args) {
        University university = new University("University of Cambridge", "The Old Schools, Trinity Ln, Cambridge CB2 1TN, United Kingdom");

        Faculty compSci = new Faculty("Computer Science");
        Specialization webDev = new Specialization("Web Development");
        Specialization se = new Specialization("Software Engineering");
        compSci.addSpecialization(webDev);
        compSci.addSpecialization(se);
        university.addFaculty(compSci);

        Subject webBasics = new Subject("Web Development Basics", 3);
        Subject advancedProgramming = new Subject("Advanced Programming", 4);
        webDev.addSubject(webBasics);
        se.addSubject(advancedProgramming);

        Exam webDevExam = new Exam(webBasics, new Date(), 70);
        Exam programmingExam = new Exam(advancedProgramming, new Date(), 75);

        Student student = new Student("Maciej Lewandowski");
        student.enrollInSubject(webBasics);
        student.enrollInSubject(advancedProgramming);

        Enrollment enrollmentWebDev = new Enrollment(student, webBasics);
        enrollmentWebDev.setGrade(88);
        Enrollment enrollmentProgramming = new Enrollment(student, advancedProgramming);
        enrollmentProgramming.setGrade(90);

        Cost cost = new Cost(5000.00, 1000.00);
        FinancialAid scholarship = new FinancialAid("Scholarship", 2000.00);

        Admission admission = new Admission("High School Diploma", new Date(), 50.00);

        System.out.println("University: " + university.getName() + "\nAddress: " + university.getAddress());
        System.out.println("Faculties:");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println("  - " + faculty.getName());
        }

        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Subjects:");
        for (Subject subject : student.getEnrolledSubjects()) {
            System.out.println("  - " + subject.getName() + ", Credits: " + subject.getCredits());
        }

        System.out.println("Financials: Total Cost - " + cost.calculateTotalCost() + ", Financial Aid - " + scholarship.getAmount());
        System.out.println("Admission Requirement: " + admission.getRequirements() + ", Application Fee: " + admission.getApplicationFee());
    }
}

