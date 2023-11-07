package homework2.interfaces;

import homework2.Subject;

import java.util.List;

public interface Teachable {
    void teachSubject(Subject subject);
    List<Subject> getTaughtSubjects();

}

