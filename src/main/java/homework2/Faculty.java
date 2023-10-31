package homework2;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Specialization> specializations;

    public Faculty(String name) {
        this.name = name;
        this.specializations = new ArrayList<>();
    }

    public void addSpecialization(Specialization specialization) {
        specializations.add(specialization);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Specialization> getSpecializations() {
        return specializations;
    }
}
