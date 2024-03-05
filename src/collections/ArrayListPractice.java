package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int next = itr.next();

            if (next == 30) {
//                list.remove(new Integer(30));  throws ConcurrentModificationException
                itr.remove();
            }
        }
        System.out.println(list);


        Iterator<Integer> anotherIterator = list.iterator();
        list.add(50);

        while (anotherIterator.hasNext()) {
            System.out.println(anotherIterator.next()); // throws ConcurrentModificationException
        }

    }
}
