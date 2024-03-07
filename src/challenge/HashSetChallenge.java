package challenge;

import java.util.HashSet;
import java.util.Set;

public class HashSetChallenge {
    public static void main(String[] args) {
//        Find duplicate element
        int[] data = {12, 12, 1, 56, 43, 34, 65};
        int duplicate = 0;

        Set<Integer> duplicates = new HashSet<>();

//        for (int i : data) {
//            if (duplicates.contains(i)) {
//                duplicate = i;
//            }
//
//            duplicates.add(i);
//        }

        for (int i : data) {
            if (!duplicates.add(i)) {
                duplicate = i;
                break;
            }
        }

        System.out.println(duplicate);

    }

}
