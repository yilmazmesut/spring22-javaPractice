package practice01;

import java.util.Scanner;

public class Q05 {

    /*
        Type java code by using ternary. Ask user to enter two integers
        Write a program to print the maximum  one on the console.(Do not forget they may be equal)
       */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int x = scan.nextInt();

        System.out.println("Enter second integer: ");
        int y = scan.nextInt();

        System.out.println(x==y ? "They are equal" :
                            (x > y  ? "Maximum Value: " + x : "Maximum Value: " + y) );   // ==> this is nested ternary.

        // System.out.println("Maximum Value: " + Math.max(x,y));
    }
}
