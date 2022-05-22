package practice01;

import java.util.Scanner;

public class Q06 {

    /*
         Ask user to enter a character and check if it is a letter.
         If it is not a letter print "Not Letter" on console.
         If it is letter check if it is lowercase or uppercase letter.
         If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char x = scan.next().charAt(0);


        // 1. Way: (with If-Else):
        if (x >= 'A' & x <= 'Z' || x >= 'a' && x <= 'z') {
            if (x >= 'A' & x <= 'Z') {
                System.out.println("Uppercase Letter");
            } else {
                System.out.println("Lowercase Letter");
            }
        } else {
            System.out.println("Not Letter");
        }


        // 2. way: (with Nested Ternary):
        System.out.println(x >= 'A' && x <= 'Z' || x >= 'a' && x <= 'z' ?
                (x >= 'A' && x <= 'Z' ? "Uppercase Letter" : "Lowercase Letter") :
                "Not Letter");

            // Logic way:
            System.out.println(x >= 'A' && x <= 'Z' || x >= 'a' && x <= 'z' ?
                    x <= 'Z' ? "Uppercase Letter" : "Lowercase Letter" :
                    "Not Letter");

    }
}
