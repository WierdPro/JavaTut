import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("Lesson 4");
        System.out.println("User Input\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("\n");

        System.out.println("Hello " + name);
        System.out.println("You have " + age + " years old");
        System.out.println("Your favorite food is " + food);

    }
}
