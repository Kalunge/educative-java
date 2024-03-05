package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Employee employee) {
//        we will sort the employee based on age in asc order
//        returns a negative , zero or positive integer as this employee age
//        is less than, equal to, or greater than the specified object
        return (this.age - employee.age);
    }


    public static class ArrayListDemo {
        public static void main(String[] args) {
            List<Employee> list = new ArrayList<>();
            list.add(new Employee("Jane", 129));
            list.add(new Employee("Alex", 54));

            Collections.sort(list);

            for (Employee e : list) {
                System.out.println(e.name);
            }


        }
    }


}

