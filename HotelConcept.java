package snippet;

import java.util.Scanner;

public class HotelConcept {

	public static void main(String[] args) {

//		Show this menu every time:
//			===== VENDING MACHINE =====
//			1. Tea      - ₹10
//			2. Coffee   - ₹15
//			3. Juice    - ₹20
//			4. Snacks   - ₹25
//			0. Shutdown Machine
//			Use a switch statement to:
//			Validate the user’s choice
//			Assign price based on selection
//			Handle invalid selections
		
		Scanner scan = new Scanner(System.in);
		
		int choice;
		
		do
		{
			System.out.println("<===== VENDING MACHINE =====>");
			System.out.println("1. Tea     ");
			System.out.println("2. Coffee  ");
			System.out.println("3. Juice   ");
			System.out.println("4. Snacks  ");
			System.out.println("0. Shutdown Machine");
			System.out.println("Enter The Choice Number: ");
			choice = scan.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.println("1. Tea        -> 10 Rs");
				break;
			}
			
			case 2:
			{
				System.out.println("2. Coffee     -> 15 Rs");
				break;
			}
			
			case 3:
			{
				System.out.println("3. Juice      -> 20 Rs");
				break;
			}
			
			case 4:
			{
				System.out.println("4. Snacks     -> 25 Rs");
				break;
			}
			
			case 0:
			{
				System.out.println("0. Shutdown Machine");
				break;
			}
			
			default :
			{
				System.out.println("Please Enter The Valid Input...");
				break;
			}
			
			}
			
		}
		while(choice != 0);
		scan.close();
	}

}
