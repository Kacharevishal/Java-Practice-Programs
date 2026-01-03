package snippet;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {

//		Order Summary
//		After successful payment, print:
//		Item: Coffee
//		Quantity: 2
//		Total Cost: ₹30
//		Paid: ₹50
//		Change Returned:
//		₹20 x 1

		Scanner scan = new Scanner(System.in);
		int choice;
		System.out.println("Welcome To The Dark Coffee Center...");

		do {
			System.out.println("1. Normal Coffee        -> 50 Rs");
			System.out.println("2. Black Cold Coffee    -> 100 Rs");
			System.out.println("3. Black Hot Coffee     -> 200 Rs");
			System.out.println("4. Dark Coffee          -> 150 Rs");
			System.out.println("5. Extra Dark Coffee    -> 350 Rs");
			System.out.println("Enter The Product No: ");
			choice = scan.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("-----------------------------------------");
				System.out.println("1. Normal Coffee        -> 50 Rs");

				System.out.println("Enter The Quantity of Product: ");
				int quantity = scan.nextInt();

				double cost = (50 * quantity);
				System.out.println("Total Cost: " + cost + " Rs");

				System.out.println("Enter Paid Amount: ");
				double paid = scan.nextDouble();
				System.out.println("Paid: " + paid + " Rs");

				double change = (paid - cost);

				if (cost < paid) {
					System.out.println("Change Return: " + change);
				} else {
					change = (cost - paid);
					System.out.println("Please Pay remaning amount : " + change + " Rs");
				}

				System.out.println("Thank You Visit Again...");
				break;
			}

			case 2: {
				System.out.println("-----------------------------------------");
				System.out.println("2. Black Cold Coffee    -> 100 Rs");

				System.out.println("Enter The Quantity of Product: ");
				int quantity = scan.nextInt();

				double cost = (100 * quantity);
				System.out.println("Total Cost: " + cost + " Rs");

				System.out.println("Enter Paid Amount: ");
				double paid = scan.nextDouble();
				System.out.println("Paid: " + paid + " Rs");

				double change = (paid - cost);

				if (cost < paid) {
					System.out.println("Change Return: " + change);
				} else {
					change = (cost - paid);
					System.out.println("Please Pay remaning amount : " + change + " Rs");
				}

				System.out.println("Thank You Visit Again...");
				break;
			}

			case 3: {
				System.out.println("-----------------------------------------");
				System.out.println("3. Black Hot Coffee     -> 50 Rs");

				System.out.println("Enter The Quantity of Product: ");
				int quantity = scan.nextInt();

				double cost = (200 * quantity);
				System.out.println("Total Cost: " + cost + " Rs");

				System.out.println("Enter Paid Amount: ");
				double paid = scan.nextDouble();
				System.out.println("Paid: " + paid + " Rs");

				double change = (paid - cost);

				if (cost < paid) {
					System.out.println("Change Return: " + change);
				} else {
					change = (cost - paid);
					System.out.println("Please Pay remaning amount : " + change + " Rs");
				}

				System.out.println("Thank You Visit Again...");
				break;
			}

			case 4: {
				System.out.println("-----------------------------------------");
				System.out.println("4. Dark Coffee          -> 150 Rs");

				System.out.println("Enter The Quantity of Product: ");
				int quantity = scan.nextInt();

				double cost = (150 * quantity);
				System.out.println("Total Cost: " + cost + " Rs");

				System.out.println("Enter Paid Amount: ");
				double paid = scan.nextDouble();
				System.out.println("Paid: " + paid + " Rs");

				double change = (paid - cost);

				if (cost < paid) {
					System.out.println("Change Return: " + change);
				} else {
					change = (cost - paid);
					System.out.println("Please Pay remaning amount : " + change + " Rs");
				}

				System.out.println("Thank You Visit Again...");
				break;
			}

			case 5: {
				System.out.println("-----------------------------------------");
				System.out.println("5. Extra Dark Coffee    -> 350 Rs");

				System.out.println("Enter The Quantity of Product: ");
				int quantity = scan.nextInt();

				double cost = (350 * quantity);
				System.out.println("Total Cost: " + cost + " Rs");

				System.out.println("Enter Paid Amount: ");
				double paid = scan.nextDouble();
				System.out.println("Paid: " + paid + " Rs");

				double change = (paid - cost);

				if (cost < paid) {
					System.out.println("Change Return: " + change);
				} else {
					change = (cost - paid);
					System.out.println("Please Pay remaning amount : " + change + " Rs");
				}

				System.out.println("Thank You Visit Again...");
				break;
			}
			case 0:
				System.out.println("MACHINE CLOSED...");
			}
		} while (choice != 0);
		scan.close();
	}
}
