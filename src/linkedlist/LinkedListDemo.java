package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1); // adds 1 to the list
        linkedList.add(2); // adds 2 to the end of the list
        linkedList.add(4);

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
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst()); // fetching the first element
        System.out.println(linkedList.get(3)); // fetching the element at the third index
        System.out.println(linkedList.getLast()); // fetching the last element

        System.out.println("Linked List before removing any element: " + linkedList);

        linkedList.remove(); // removes the first element
        System.out.println("LinkedList after removing the first element: " +linkedList);

        linkedList.removeLast(); // removes the last element
        System.out.println("LinkedList after removing the last element: " +linkedList);



        linkedList.remove(Integer.valueOf(2)); // removes the first occurrence of 2
        System.out.println("LinkedList after removing  the first occurrence of 2: " +linkedList);

        linkedList.removeLastOccurrence(4); // removes the last occurrence of 4
        System.out.println("LinkedList after removing  the last occurrence of 4: " +linkedList);

        Collections.sort(linkedList);
        System.out.println("sorted linkedList: " + linkedList);

    }

}
