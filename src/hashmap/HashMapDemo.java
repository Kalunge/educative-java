package hashmap;

import java.security.KeyStore;
import java.util.*;

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

        System.out.println(stockPrice.containsKey("Microsoft")); // returns true
        System.out.println(stockPrice.containsValue(1213)); // returns true

        System.out.println("HashMap keys");
        Set<String> keys = stockPrice.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("HashMap values");
        Collection<Integer> values = stockPrice.values();
        for (int value : values) {
            System.out.println(value);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("India", 5);
        map.put("USA", 3);
        map.put("China", 5);
        map.put("Russia", 6);

        // increase value of india by 1 if present
        map.compute("India", (key, value) -> value == null ? 10 : value + 1);

        // insert Vietnam with a value of 10
        map.compute("Vietnam", (key, value) -> value == null ? 10 : value + 1);

        System.out.println(map);

        System.out.println(stockPrice.isEmpty());

        map.computeIfAbsent("Malaysia", k -> k.length());
        System.out.println(map);


        // increment the value of India by one since it is present
        map.computeIfPresent("India", (k, v) -> v == null ? 10 : v + 1);
        System.out.println(map);

        // will not Insert Kenya into the map
        map.computeIfPresent("Kenya", (k, v) -> v == null ? 10 : v + 1);
        System.out.println(map);

        Map<String, Integer> mapOne = new HashMap<>();

        mapOne.put("Jay", 5000);
        mapOne.put("Rahul", 3000);
        mapOne.put("Nidhi", 4500);
        mapOne.put("Amol", 60000);

        Map<String, Integer> mapTwo = new HashMap<>();
        mapTwo.put("Jay", 7000);
        mapTwo.put("Rahul", 4500);
        mapTwo.put("Nidhi", 1200);
        mapTwo.put("Saurav", 25000);

        mapOne.forEach((key, value) -> mapTwo.merge(key, value, (v1, v2) -> v1 + v2));
        System.out.println(mapTwo);


        Employee employeeOne = new Employee(123, "Jane");
        Employee employeeTwo = new Employee(123, "Jane");

        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(employeeOne, 56000);
        employeeMap.put(employeeTwo, 45000);

        employeeOne.name = "Muthomi";
        System.out.println(employeeMap.get(employeeOne));


        for (Map.Entry<Employee, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee id: " + entry.getKey().id + " employee name: " + entry.getKey().name);
        }


        Set<Map.Entry<String, Integer>> entrySet = stockPrice.entrySet(); // returns a set of entries

        for(Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Company name: " + entry.getKey() + " Stock price: " + entry.getValue());
        }


    }
}
