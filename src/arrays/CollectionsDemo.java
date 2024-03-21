package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("The minimum element in the lists is: " + Collections.min(list));
        System.out.println("The maximum element in the lists is: " + Collections.max(list));
        System.out.println("The number of time 12 occurs in the list is: " + Collections.frequency(list, 12));
        System.out.println("The element 222 can be found at: " + Collections.binarySearch(list, 222));

        List<Integer> list2 = new ArrayList<>();
        list2.add(90);
        list2.add(12);
        list2.add(98);
        list2.add(43);

        Collections.copy(list, list2);
        System.out.println(list);

        Collections.fill(list2, 14);
        System.out.println(list2);
    }
}
