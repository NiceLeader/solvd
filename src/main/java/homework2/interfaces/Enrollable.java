package homework2.interfaces;

import homework2.Subject;

import java.util.List;

public interface Enrollable {
    void enrollInSubject(Subject subject);
    List<Subject> getEnrolledSubjects();

}
