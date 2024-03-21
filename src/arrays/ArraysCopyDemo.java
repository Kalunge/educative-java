package arrays;

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
    }
}
