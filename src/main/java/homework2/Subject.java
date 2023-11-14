package homework2;

import homework2.exception.DataValidationException;
import homework2.university.UniversityConfig;

import java.util.List;
import java.util.stream.Collectors;

public class Subject {
    private String name;
    private int credits;


    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
    public static String subjectsToString(List<Subject> subjects) {
        return subjects.stream()
                .map(Subject::toString)
                .collect(Collectors.joining(", "));
    }
    @Override
    public String toString() {
        return name + " (" + credits + " credits)";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) throws DataValidationException {
        if (name == null || name.isEmpty()) {
            throw new DataValidationException();
        }
        this.name = name;
    }


    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCreditPoints() {
        return credits * 10;
    }

    public int getEnrolledStudentCount() {
        return UniversityConfig.totalEnrolledStudents;
    }
}
