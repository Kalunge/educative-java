package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56); // inserting share price of oracle into the map
        System.out.println(stockPrice);

        stockPrice.put("Oracle", 70); // inserting share price of oracle again, this should update the existing value
        System.out.println(stockPrice);

        stockPrice.putIfAbsent("Oracle", 100); // inserting share price of oracle again using puIfAbsent
        System.out.println(stockPrice);

    }
}
