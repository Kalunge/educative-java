package hashset;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns true
        System.out.println("Inserting 27 in the HashSet: " + set.add(27)); // returns true
        System.out.println("Inserting 23 in the HashSet: " + set.add(23)); // returns false as the element is already present
        set.add(56);
        System.out.println();
        System.out.println("Iterating the set using for loop");

        for (int i : set) {
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
        set.add(5);
        set.add(7);

        List<Integer> list = new ArrayList<>(set); // creating an arraylist from an existing set
        Collections.sort(list); // sorting the list

        System.out.println("Sorted list: ");

        list.forEach(System.out::println);

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
