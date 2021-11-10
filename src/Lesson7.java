import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        System.out.println("Lesson 7");
        System.out.println("Math class\n");

        double x;
        double y;
        double z;

        double a = 3.14;
        double b = -10;
        double w = 10;
        double c = Math.min(a, b);
        double d = Math.max(a, b);
        double e = Math.abs(b);
        double f = Math.sqrt(w);
        double g = Math.round(a);
        double h = Math.ceil(a);
        double i = Math.floor(a);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse is: " + z);

        scanner.close();

    }
}
