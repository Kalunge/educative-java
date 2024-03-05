package collections;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        list.remove(1); // remove element at index 1 i.e 20
        System.out.println(list);

        list.remove(Integer.valueOf(30)); // remove 30 from the list
        System.out.println(list);

        list.clear(); // remove all the elements from the list
        System.out.println(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

//        stringList.replaceAll((element) -> element.toUpperCase());
        stringList.replaceAll(String::toUpperCase);

        System.out.println(stringList);

    }
}
