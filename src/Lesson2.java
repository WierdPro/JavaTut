public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Lesson 2");
        System.out.println("Variables\n");

        System.out.println("Boolean         1 bit       true or false");
        System.out.println("Byte            1 byte      -128 to 127");
        System.out.println("Short           2 bytes     -32,768 to 32,767");
        System.out.println("Int             4 bytes     -2 billion to 2 billion");
        System.out.println("Long            8 bytes     -9 quintillion to 9 quintillion\n");

        System.out.println("Float           4 bytes     Fractional number up to 6-7 digits ex. 3.141592f");
        System.out.println("Double          8 bytes     Fractional number up to 15 digits ex. 3.141592653589793\n");

        System.out.println("Char            2 bytes     Single character/letter/ASCII value ex. 'l'");
        System.out.println("String          varies      A sequence of characters ex. \"Never gonna give you up!\"\n");

        int x = 69;
        long y = 1234567890123456789L;
        double z = 3.14;
        boolean a = true;
        char b = 'F';
        String name = "Takkapi";

        System.out.println("My number is " + x);
        System.out.println("My long number is " + y);
        System.out.println("My double number is " + z);
        System.out.println("Learning Java: " + a);
        System.out.println("Press " + b + " to pay respect");
        System.out.println(name);

    }
}
