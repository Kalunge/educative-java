package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Iterating using forEachRemaining() method");
        Iterator<Integer> newItr = list.iterator();

        newItr.forEachRemaining(element -> System.out.println(element));
//        newItr.forEachRemaining(System.out::println);
    }
}
