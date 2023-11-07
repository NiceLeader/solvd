package homework2;

import homework2.interfaces.Teachable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Person implements Teachable {
    private final List<Subject> taughtSubjects;

    public Professor(String name) {
        super(name);
        this.taughtSubjects = new ArrayList<>();
    }

    @Override
    public void teachSubject(Subject subject) {
        this.taughtSubjects.add(subject);
    }

    @Override
    public List<Subject> getTaughtSubjects() {
        return new ArrayList<>(this.taughtSubjects);
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    @Override
    public void enrollInSubject(Subject subject) {

    }

    @Override
    public List<Subject> getEnrolledSubjects() {
        return null;
    }

    @Override
    public void addGrade(double grade) {

    }

    @Override
    public List<Double> getGrades() {
        return null;
    }

    @Override
    public void processPayment(BigDecimal amount) {

    }

    @Override
    public BigDecimal getBalance() {
        return null;
    }
}
