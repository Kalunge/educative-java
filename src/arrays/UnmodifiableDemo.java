package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("USA");
        list.add("Russia");

        List<String> unmodifiableList = Collections.unmodifiableList(list);

        unmodifiableList.add("China"); // throws UnsupportedOperationException
    }
}
