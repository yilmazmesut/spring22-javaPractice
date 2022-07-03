package practice02;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        /*
		 Ask user to enter two words. If the number of characters of the first word is even(cift), then put the second word into the middle of the first word.
		 If the number of characters of second word is odd, then print on console "You can not put second word into the middle of the first word.
		 Because it's number of character is odd.".
        */

        Scanner input = new Scanner(System.in);
        System.out.println("enter 1. word: ");
        String firstName = input.nextLine();
        System.out.println("enter 1. word: ");
        String secondName = input.nextLine();

        if (firstName.length()%2==0) {
            String firstPartOfFirstName = firstName.substring(0, firstName.length() / 2);
            String secondPartOfFirstName = firstName.substring(firstName.length() / 2);
            System.out.println(firstPartOfFirstName + secondName + secondPartOfFirstName);
        } else {
            System.out.println("You can not put second word into the middle of the first word. Because it's number of character is odd.");
        }



    }
}
