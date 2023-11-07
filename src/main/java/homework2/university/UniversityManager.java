package homework2.university;

import homework2.Subject;
import homework2.interfaces.Enrollable;

public class UniversityManager {
    private static final int MAX_STUDENTS_PER_SUBJECT = 25;

    public void processEnrollment(Enrollable enrollee) {

        if (!canEnrollMoreSubjects(enrollee)) {
            System.out.println("Student nie może zapisać się na więcej przedmiotów.");
            return;
        }

        for (Subject subject : enrollee.getEnrolledSubjects()) {
            if (isSubjectAvailable(subject)) {
                // Logika zapisu studenta na przedmiot
                System.out.println("Student zapisany na przedmiot: " + subject.getName());
            } else {
                // Jeśli przedmiot nie jest dostępny
                System.out.println("Przedmiot nie jest dostępny: " + subject.getName());
            }
        }


        UniversityConfig.incrementEnrolledStudents();
    }
    private boolean canEnrollMoreSubjects(Enrollable enrollee) {
        final int MAX_CREDITS_PER_SEMESTER = 30;

        int currentCredits = enrollee.getEnrolledSubjects().stream()
                .mapToInt(Subject::getCreditPoints)
                .sum();

        return currentCredits <= MAX_CREDITS_PER_SEMESTER;
    }
    private boolean isSubjectAvailable(Subject subject) {

        int enrolledStudentCount = subject.getEnrolledStudentCount();

        return enrolledStudentCount < MAX_STUDENTS_PER_SUBJECT;
    }


}
