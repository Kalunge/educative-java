import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
}