package practice01;

import java.util.Scanner;

public class Q04 {

    // Type a code that calculates the hypotenuse?

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the fist leg of the right triangle: ");
        double a = scan.nextDouble();

        System.out.println("Enter the length of the fist leg of the right triangle: ");
        double b = scan.nextDouble();

        double hypotenuse = Math.sqrt(a*a + b*b);   // for "square root" (kare kok) we can use Math class.

        System.out.println("Hypotenuse = " + hypotenuse);

    }
}
