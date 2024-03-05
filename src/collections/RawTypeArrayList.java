package collections;

import java.util.ArrayList;
import java.util.List;

public class RawTypeArrayList {
    public static void doSomeWork(List list) {
        list.add("India");
    }
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        doSomeWork(list);

        Integer i = (Integer) list.get(2);
    }
}
