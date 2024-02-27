import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        payCalculator();

    }

    public static void twoDigitsChecker() {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scanner.nextInt();

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

        String message = "There once was a person named " + userName + " who lived in " + city + ". At the age of " + age + ", " + userName + " went to college at " + college + ". " + userName + " graduated and went to work as a " + profession + ". Then, " + userName + " adopted an animal named " + pet + ". They both lived happily ever after!";


        System.out.println(message);
    }

    public static void payCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of hours worked");
        int hours = scanner.nextInt();

        System.out.println("Enter your hourly pay rate");
        double payRate = scanner.nextDouble();

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
}