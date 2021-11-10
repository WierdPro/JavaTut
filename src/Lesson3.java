public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Lesson 3");
        System.out.println("Variables swap\n");

        String x = "Water";
        String y = "Kool-acid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
