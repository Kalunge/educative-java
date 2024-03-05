package challenge;

import java.util.Comparator;

public class ChallengeEmployee implements Comparable<ChallengeEmployee> {
    String name;
    int age;
    String city;

    public ChallengeEmployee(String name, int age, String city) {
        super();
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public int compareTo(ChallengeEmployee employee) {
        return this.city.compareTo(employee.city);
    }

//   public static class CityComparator {
//        @Override
//       public int compare(ChallengeEmployee employeeOne, ChallengeEmployee employeeTwo) {
//            return employeeOne.city.compareTo(employeeTwo.city);
//        }
//   }
}
