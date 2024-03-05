package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ListIterator<Integer> listIterator = list.listIterator(); // getting a list iterator

//        traversing elements
        System.out.println("Forward direction iteration");
        while (listIterator.hasNext()) {
            System.out.println("Next element is " + listIterator.next() + " and nex index is " + listIterator.nextIndex());
        }

        System.out.println("backward direction iteration");

        while (listIterator.hasPrevious()) {
            System.out.println("Previous element is " + listIterator.previous() + " and previous index is " + listIterator.previousIndex());
        }
    }
}
