package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        Collections.sort(list);
        System.out.println("ArrayList in ascending order: " + list);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("ArrayList in ascending order: " + sortedList);

        Collections.sort(list, Collections.reverseOrder());
//        list.sort(Collections.reverseOrder());
        System.out.println("ArrayList in descending order: " + list);

        List<Integer> reverseSorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("ArrayList in descending order: " + reverseSorted);
    }
}
