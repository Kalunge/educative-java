package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1); // adds 1 to the list
        linkedList.add(2); // adds 2 to the end of the list
        linkedList.addLast(3); // adds 3 to the end of the list
        System.out.println(linkedList);

        linkedList.addFirst(10); // adds 10 to the start of the list
        System.out.println(linkedList);

        linkedList.add(2, 20); // adds 20 to second position of the list
        System.out.println(linkedList);

        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);

        linkedList.addAll(3, list); //adds a collection of elements at third position in the list.
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst()); // fetching the first element
        System.out.println(linkedList.get(3)); // fetching the element at the third index
        System.out.println(linkedList.getLast()); // fetching the last element
    }

}
