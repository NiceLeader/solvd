package homework2;

import homework2.person.Student;

public class Enrollment {
    private Student student;
    private Subject subject;
    private Integer grade;
    private String status; // Added field for enrollment status

    public Enrollment(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
        this.status = "active"; // Default status
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        if (grade == null || grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to calculate GPA based on the grade
    public double calculateGPA() {
        if (grade >= 90) {
            return 4.0;
        } else if (grade >= 80) {
            return 3.0;
        } else if (grade >= 70) {
            return 2.0;
        } else if (grade >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // Method to determine the academic standing based on the grade
    public String getAcademicStanding() {
        if (grade >= 85) {
            return "Good Standing";
        } else if (grade >= 70) {
            return "Probation";
        } else {
            return "Subject to Disqualification";
        }
    }
}
