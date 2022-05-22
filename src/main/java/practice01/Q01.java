package practice01;

import java.util.Scanner;

public class Q01 {

    /*
	 Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way:
	 		First Name: ...
	 		Last Name : ...
	 		Age: ...
	 		Height: ...
	 		Weight: ...
	 Note: Use only one "System.out.println();"
	 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();


        System.out.println("Enter your weight");
        int weight = scan.nextInt();

        System.out.println("First Name  : " + firstName);
        System.out.println("Last Name   : " + lastName);
        System.out.println("Last Age    : " + age);
        System.out.println("Height      : " + height);
        System.out.println("Weight      : " + weight);

        System.out.println("First Name: "+firstName+"\n"+"Last Name: "+lastName+"\n"+"Age: "+age+"\n"+"Height: "+height+"\n"+"Weight: "+weight);
    }
}
