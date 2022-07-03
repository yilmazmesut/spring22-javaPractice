package practice02;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

 /*
	 Type code to do bank transactions below at an ATM:
	 Process 1: Balance inquiry
	 Process 2: Money withdrawal
	 Process 3: Deposit money
	 Process 4: End the process
	 */

        Scanner input = new Scanner(System.in);
        System.out.println("enter number of process:\n " +
                "\t Process 1: Balance inquiry\n" +
                "\t Process 2: Money withdrawal\n" +
                "\t Process 3: Deposit money\n" +
                "\t Process 4: End the process\n");
        int process = input.nextInt();
        int balance = 100;

        switch (process) {
            case 1:
                System.out.println("Your balance : " + balance);
                break;
            case 2:
                System.out.println("Enter the money you want to withdraw: ");
                int withdraw = input.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Your current balance after the withdrawel of $" + withdraw + " = $" + balance);
                } else {
                    System.out.println("Your balance is not enough");
                }
                break;
            case 3:
                System.out.println("Enter the amount of money you want to deposit: ");
                int deposit = input.nextInt();
                if (deposit > 2000) {
                    System.out.println("Daily limit of deposit maney at the ATM: $2000");
                } else {
                    balance += deposit;
                    System.out.println("Your current balance after the deposit of $" + deposit + "= $" + balance);
                }
                break;
            case 4:
                System.out.println("Thanks for using TechPro Bank.\nGood Bye ");
            default:
                System.out.println("Enter a valid number");
        }

    }
}
