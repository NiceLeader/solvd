package homework2;

import homework2.Student;
import homework2.interfaces.Counselable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcademicAdvisor extends Person implements Counselable {
    private List<Student> advisedStudents;

    public AcademicAdvisor(String name) {
        super(name);
        this.advisedStudents = new ArrayList<>();
    }

    @Override
    public void provideCounseling(Student student) {
        this.advisedStudents.add(student);
        // Logic to provide counseling to the student can be added here
    }

    @Override
    public List<Student> getAdvisedStudents() {
        return new ArrayList<>(this.advisedStudents);
    }

    @Override
    public String getRole() {
        return "Academic Advisor";
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

