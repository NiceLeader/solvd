package homework2;

import java.util.Date;

public class Exam {
    private Subject subject;
    private Date date;
    private int requiredScore;

    public Exam(Subject subject, Date date, int requiredScore) {
        this.subject = subject;
        this.date = date;
        this.requiredScore = requiredScore;
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
        this.date = date;
    }

    public int getRequiredScore() {
        return requiredScore;
    }

    public void setRequiredScore(int requiredScore) {
        this.requiredScore = requiredScore;
    }
}
