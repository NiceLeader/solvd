package homework2.university;

import homework2.person.Student;

public class UniversityUtils {
    private UniversityUtils() {
    }

    public static double calculateGPA(Student student) {
        double sumOfGrades = 0.0;
        int numberOfGrades = 0;

        for (double grade : student.getGrades()) {
            sumOfGrades += grade;
            numberOfGrades++;
        }

        if (numberOfGrades == 0) {
            return 0.0;
        }

        double gpa = sumOfGrades / numberOfGrades;

        return Math.round(gpa * 100.0) / 100.0;
    }
}
