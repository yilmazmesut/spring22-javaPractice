package practice02;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        //Ask user to enter first name, middle name and last name as one single String,
        // then print the first character of middle name and last name.
        //e.g. Mark Hansel Twain==> HT

        Scanner input = new Scanner(System.in);
        System.out.println("enter first name, middle name and last name: ");
        String str = input.nextLine().trim();

        char initialOfMiddle = str.toUpperCase().charAt(str.indexOf(" ")+1);
        char initiallOfLast = str.toUpperCase().charAt(str.lastIndexOf(" ")+1);

        System.out.print(initialOfMiddle);
        System.out.println(initiallOfLast);

    }
}
