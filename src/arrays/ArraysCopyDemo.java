package arrays;

import hashmap.Employee;

import java.util.Arrays;

public class ArraysCopyDemo {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] newArray = Arrays.copyOf(numbers, numbers.length);

        System.out.println("The copied array is");

        for(int num : newArray) {
            System.out.print(num +", ");
        }

        int[] newArrayBiggerSize = Arrays.copyOf(numbers, 20);

        System.out.println("The copied array is");

        for(int num : newArrayBiggerSize) {
            System.out.print(num +", ");
        }

        int[] rangeCopiedArray = Arrays.copyOfRange(numbers, 0, 5);

        System.out.println("The copied array is");

        for(int num : rangeCopiedArray) {
            System.out.print(num +", ");
        }

        Employee[] employees = { new Employee(123, "Jay"), new Employee(124, "Ryan") };
        Employee[] copiedArray = Arrays.copyOf(employees, 2);

        employees[0] = new Employee(123, "Changed name");
        System.out.println();
        System.out.println(employees[0].getName());

        System.out.println(copiedArray[0].getName());

    }
}
