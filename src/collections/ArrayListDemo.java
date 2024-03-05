package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(4); // add four to the end of the array
        System.out.println(list);

        list.add(1, 50);  // add 50 at index 1 and shift all other elements to the right
        System.out.println(list);

        List<Integer> newList = new ArrayList<>(); // create a new list that will be added to the original list
        newList.add(159);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);


        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList);
        System.out.println("the element at index 2 is "+ myList.get(2));
        System.out.println("the size of the list is "+ myList.size());

    }
}
