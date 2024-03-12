package hashmap;

import java.util.Objects;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        return this. id == employee.id;
    }
}
