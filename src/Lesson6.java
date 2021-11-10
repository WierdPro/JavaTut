import javax.swing.*;

public class Lesson6 {
    public static void main(String[] args) {
        System.out.println("Lesson 6");
        System.out.println("GUI intro\n");

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Your name is " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in cm)"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + " cm");

    }
}
