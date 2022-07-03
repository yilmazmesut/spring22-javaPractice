package practice02;

import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {

                  /*
		 Ask user to enter a String and count the number of 'a's come earlier than first occurrence of 'c'.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = input.nextLine().toLowerCase();
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a') {
                counter++;
            } else if (str.charAt(i)=='c' || str.charAt(i)=='C') {
                break;
            }
        }
        System.out.println("Number of 'a' befoore 'c' : " + counter);
    }
}
