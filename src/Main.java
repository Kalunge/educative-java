import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findQuadrant();

    }

    public static void twoDigitsChecker() {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        scanner.close();

        if (number >= 10 && number <= 99) {
            System.out.println("Two digits");
        } else {
            System.out.println("Not two digits");
        }
    }

    public static void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your city");
        String city = scanner.nextLine();

        System.out.println("Enter your college");
        String college = scanner.nextLine();

        System.out.println("Enter your profession");
        String profession = scanner.nextLine();

        System.out.println("Enter your pet's name");
        String pet = scanner.nextLine();

        scanner.close();

        String message = "There once was a person named " + userName + " who lived in " + city + ". At the age of " + age + ", " + userName + " went to college at " + college + ". " + userName + " graduated and went to work as a " + profession + ". Then, " + userName + " adopted an animal named " + pet + ". They both lived happily ever after!";


        System.out.println(message);
    }

    public static void payCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of hours worked");
        int hours = scanner.nextInt();

        System.out.println("Enter your hourly pay rate");
        double payRate = scanner.nextDouble();
        scanner.close();

        double pay;
        double overTime;
        double totalpay;

        if (hours < 40) {
            pay = hours * payRate;
            System.out.println("Regular pay: " + pay);
        } else {
            pay = 40 * payRate;
            overTime = (hours - 40) * payRate * 1.5;
            totalpay = overTime + pay;

            System.out.println("Regular pay: " + pay);
            System.out.println("Overtime pay: " + overTime);
            System.out.println("Total pay: " + totalpay);

        }


    }

    public static void findQuadrant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x");
        int x = scanner.nextInt();

        System.out.println("enter y");
        int y = scanner.nextInt();
        scanner.close();

        if (x < 0 && y > 0) {
            System.out.println("The point lies in the 2nd Quadrant.");
        } else if (x > 0 && y > 0) {
            System.out.println("The point lies in the 1st Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in the 4th Quadrant.");
        } else {
            System.out.println("The point lies in the 3rd Quadrant.");
        }
    }

    public static void formulaConverter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter X");
        int x = scanner.nextInt();

        System.out.println("enter Y");
        int y = scanner.nextInt();

        int result = (3 * x) + (5 * y);

        System.out.println("result = " + result);
    }
}