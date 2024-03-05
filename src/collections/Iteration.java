package collections;

import java.util.ArrayList;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("for loop");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("enhanced for loop");

        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
