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

        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        System.out.println(stockPrice.get("Oracle"));
        System.out.println(stockPrice.get("Google")); // should return null

        // since google is not present , this will insert it with default value of q00.
        System.out.println(stockPrice.getOrDefault("Google", 100));

    }
}
