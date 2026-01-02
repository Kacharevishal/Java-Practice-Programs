package snippet;

import java.util.Scanner;

public class ATMSimmulation {

	public static void main(String[] args) {
//		Create an ATM program using a switch statement:
//			1 → Check Balance
//			2 → Deposit
//			3 → Withdraw
//			4 → Exit
		Scanner scan = new Scanner(System.in);

		int num;
		double balance = 0;

		do {
			System.out.println("<-----ATM CONCEPT----->");
			System.out.println("1 ---> Check Balance");
			System.out.println("2 ---> Deposit");
			System.out.println("3 ---> Withdraw");
			System.out.println("4 ---> Exit");
			System.out.println("Enter The Command: ");

			num = scan.nextInt();

			switch (num) {
			case 1: {
				System.out.println("Your Current Balance is: " + balance);
				break;
			}

			case 2: {
				System.out.println("Enter Amount to Deposit $ : ");
				double deposit = scan.nextDouble();

				if (deposit > 0) {
					balance += deposit;
					System.out.println("Deposit Successful...");
				} else {
					System.out.println("Invalid Deposit Amount...");
				}
				break;
			}

			case 3: {
				System.out.println("Enter Amount to Withdraw $ : ");
				double withdraw = scan.nextDouble();

				if (withdraw > 0 && withdraw <= balance) {
					balance -= withdraw;
					System.out.println("Withdraw Successful...");
				} else {
					System.out.println("Insufficiant Balance...");
				}
				break;
			}

			case 4: {
				System.out.println("Thans You...! Visit Again... Have A Nice Day...");
				break;
			}

			default: {
				System.out.println("Invalid Input Please Enter No Between 1 To 4 ");

			}
			}

		} while (num != 4);

	}
}
