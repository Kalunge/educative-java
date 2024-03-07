package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns true
        System.out.println("Inserting 27 in the HashSet: " + set.add(27)); // returns true
        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns false as the element is already present
        set.add(56);
        System.out.println();
        System.out.println("Iterating the set using for loop");

        for(int i : set) {
            System.out.println(i);
        }
        System.out.println("End of iteration");
        System.out.println();

        System.out.println("Iterating the set using Iterator");


        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating the set using forEach");

        set.forEach(elem -> System.out.println(elem));
//        set.forEach(System.out::println); // using lambda

        System.out.println(set);

        System.out.println(set.contains(23));

        set.remove(23);
        System.out.println("Hashset after removing one element: " + set);
        System.out.println(set.isEmpty());
        set.clear(); // returns false as set has some elements
        System.out.println("Hashset after removing all elements: " + set);
        System.out.println(set.isEmpty()); // returns true after clear
    }
}
