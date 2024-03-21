package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysOperationsDemo {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8};
        List<Integer> list = Arrays.asList(numbers);

        System.out.println(list);

        int[] numbersOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbersTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] numbersThree = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbersFour = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean isEqual = Arrays.equals(numbersOne, numbersTwo);

        System.out.println("Checking if two arrays are equal : " +isEqual);

        boolean isEquals = Arrays.equals(numbersThree, numbersFour);

        System.out.println("Checking if two arrays are equal : " +isEquals);
    }
}
