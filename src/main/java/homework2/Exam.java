package homework2;

import java.util.Date;

public class Exam {
    private Subject subject;
    private Date date;
    private int requiredScore;

    public Exam(Subject subject, Date date, int requiredScore) {
        this.subject = subject;
        setDate(date); // Use the setter for validation
        setRequiredScore(requiredScore); // Use the setter for validation
    }

    public Exam() {

    }

    public void takeExam(int studentScore) {
        if (isScoreSufficient(studentScore)) {
            System.out.println("Student has passed the exam with a score of " + studentScore);
        } else {
            System.out.println("Student has not passed the exam.");
        }
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if (date.before(new Date())) {
            throw new IllegalArgumentException("Exam date must be in the future");
        }
        this.date = date;
    }

    public int getRequiredScore() {
        return requiredScore;
    }

    public void setRequiredScore(int requiredScore) {
        if (requiredScore < 0 || requiredScore > 100) {
            throw new IllegalArgumentException("Required score must be between 0 and 100");
        }
        this.requiredScore = requiredScore;
    }

    // Method to determine if a student's score meets the required score
    public boolean isScoreSufficient(int studentScore) {
        return studentScore >= requiredScore;
    }
}
