package homework2.university;

import homework2.Subject;
import homework2.exception.EnrollmentException;
import homework2.interfaces.Enrollable;

import java.util.logging.Logger;

public class UniversityManager {
    private static final Logger LOGGER = Logger.getLogger(UniversityManager.class.getName());
    private static final int MAX_STUDENTS_PER_SUBJECT = 25;

    public void processEnrollment(Enrollable enrollee) throws EnrollmentException {

        if (!canEnrollMoreSubjects(enrollee)) {
            throw new EnrollmentException();
        }

        for (Subject subject : enrollee.getEnrolledSubjects()) {
            if (isSubjectAvailable(subject)) {
                LOGGER.info("Student enrolled in subject: " + subject.getName());
            } else {
                throw new EnrollmentException();
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
