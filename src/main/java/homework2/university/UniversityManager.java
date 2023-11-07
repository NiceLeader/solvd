package homework2.university;

import homework2.Subject;
import homework2.interfaces.Enrollable;

public class UniversityManager {
    private static final int MAX_STUDENTS_PER_SUBJECT = 25;

    public void processEnrollment(Enrollable enrollee) {

        if (!canEnrollMoreSubjects(enrollee)) {
            System.out.println("Student cannot enroll in more subjects");
            return;
        }

        for (Subject subject : enrollee.getEnrolledSubjects()) {
            if (isSubjectAvailable(subject)) {
                System.out.println("Student enrolled in subject: " + subject.getName());
            } else {
                System.out.println("Subject is not available: " + subject.getName());
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
