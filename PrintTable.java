import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter The Table No: ");
		int num = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
		scan.close();
	}

}
