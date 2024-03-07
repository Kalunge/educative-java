package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns true
        System.out.println("Inserting 27 in the HashSet: " + set.add(27)); // returns true
        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns false as the element is already present

        System.out.println(set);
    }
}
