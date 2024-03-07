package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns true
        System.out.println("Inserting 27 in the HashSet: " + set.add(27)); // returns true
        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns false as the element is already present
        set.add(56);

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
