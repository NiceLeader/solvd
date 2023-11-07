
package homework2.person;

import homework2.interfaces.Enrollable;
import homework2.interfaces.Evaluatable;
import homework2.interfaces.Financeable;

public abstract class Person implements Enrollable, Evaluatable, Financeable {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getRole();


}
