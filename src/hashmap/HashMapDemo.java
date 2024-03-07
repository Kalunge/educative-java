package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 30); // inserting share price of oracle into the map
        System.out.println(stockPrice);

        stockPrice.put("Oracle", 56); // inserting share price of oracle again, this should update the existing value
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

        //this will not replace the value of oracle because current value is not 70
        stockPrice.replace("Oracle", 70, 76);
        System.out.println(stockPrice.get("Oracle"));

        //this will replace the value of oracle because current value is  56
        stockPrice.replace("Oracle", 56, 76);
        System.out.println(stockPrice.get("Oracle"));

        // this will replace the value of Fiserv as the current value does not matter
        stockPrice.replace("Fiserv", 100);
        System.out.println(stockPrice.get("Fiserv"));

        // Using the replace all method to add 1000 to the price of each stock
        stockPrice.replaceAll((key, value) -> value + 1000);
        System.out.println(stockPrice);

        System.out.println(stockPrice.remove("Oracle")); //this will remove Oracle from the Map and return oracle value = 1076
        System.out.println(stockPrice.remove("Google")); // will return null as Google is not in the Map
        System.out.println(stockPrice.remove("BMW", 30)); // will return false as 30 is not the value of BMW

    }
}
