package challenge;

import collections.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class MainChallenge {
    public static void main(String[] args) {
        List<ChallengeEmployee> list = new ArrayList<>();

        list.add(new ChallengeEmployee("Alex", 23, "USA"));
        list.add(new ChallengeEmployee("Dave", 34, "India"));
        list.add(new ChallengeEmployee("Carl", 21, "USA"));
        list.add(new ChallengeEmployee("Joe", 56, "Russia"));
        list.add(new ChallengeEmployee("Amit", 64, "China"));
        list.add(new ChallengeEmployee("Ryan", 19, "Brazil"));

//        All the employee names whose age is more than 50. first approach
        List<ChallengeEmployee> employeeAgedAbove50 = list.stream().filter(employee -> employee.age > 50).collect(Collectors.toList());

        for (ChallengeEmployee em : employeeAgedAbove50) {
            System.out.println("employee age is " + em.age + " name is " + em.age + " city is " + em.city);
        }

//        second approach
        Iterator<ChallengeEmployee> itr = list.iterator();

        List<ChallengeEmployee> newList = new ArrayList<>();

        while (itr.hasNext()) {
            ChallengeEmployee em = itr.next();
            if (em.age > 50) {
                newList.add(em);
            }

        }

        System.out.println();
        for (ChallengeEmployee em : newList) {
            System.out.println(em.name);
        }

        List<ChallengeEmployee> employeesFromUSA = new ArrayList<>();

        System.out.println(" Find employees from the USA");

        Iterator<ChallengeEmployee> newItr = list.iterator();

        while (newItr.hasNext()) {
            ChallengeEmployee em = newItr.next();
            if (Objects.equals(em.city, "USA")) {
//                newItr.remove();
                employeesFromUSA.add(em);
            }
        }

        for (ChallengeEmployee e : employeesFromUSA) {
            System.out.println(e.name);
        }


        System.out.println("sort employees by country using comparable");
        Collections.sort(list);

        for(ChallengeEmployee employee : list) {
            System.out.println(employee.city);
        }

        System.out.println("sort employees by country using Comparator");
        Collections.sort(list, new Comparator<ChallengeEmployee>() {
            @Override
            public int compare(ChallengeEmployee o1, ChallengeEmployee o2) {
                return o1.city.compareTo(o2.city);
            }
        });

        for(ChallengeEmployee employee : list) {
            System.out.println(employee.city);
        }

    }
}
