package practice02;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        /*
   A company decided to give bonus of 5% of salary to employee if his/her year of
   service is 5 and more than 5 years.
   Ask user for their salary and year of service and print the net bonus amount.
   If employee can not get bonus, print how many more years he/she should work.

   EXAMPLE:
   INPUT   :   Year    => 4 year service
               Salary  => 4000

   OUTPUT :  You need to work 1 year(s) to get bonus
    */

        Scanner input = new Scanner(System.in);
        System.out.println("enter year: ");
        int year = Math.abs(input.nextInt());
        System.out.println("enter salary: ");
        int salary = Math.abs(input.nextInt());

        if (year<5) {
            int remainingYear = 5-year;
            System.out.println("You need to work " + remainingYear + " year(s) to get bonus");
        } else {
            int bonus = salary*5/100;
            System.out.println("Your bonus amount: " + bonus );
        }


    }
}
