package arrays;

import hashmap.Employee;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is: " + index);

        int anotherIndex = Arrays.binarySearch(numbers, 5,9,4);

        System.out.println("The index of element 4 in the array is: " + anotherIndex);

        anotherIndex = Arrays.binarySearch(numbers, 1, 5, 4);

        System.out.println("The index of element 4 in the array is: " + anotherIndex);

        Employee[] employees = { new Employee(123, "Jay"), new Employee(124, "Roy"), new Employee(125, "Nikki"),
                new Employee(126, "Tom") };

      //  int employeeIndex = Arrays.binarySearch(employees, new Employee(124, "Roy")); // throws ClassCast exception as Employee doesnt implement Comparable interface
        int employeeIndex = Arrays.binarySearch(employees, new Employee(125, "Nikki"), (emp1, emp2) -> emp1.getId() - emp2.getId());
        System.out.println("The index of employee  in the array is: " + employeeIndex);

    }
}
