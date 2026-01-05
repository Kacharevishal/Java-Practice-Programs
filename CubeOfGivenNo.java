import java.util.Scanner;

public class CubeOfGivenNo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();
		int cube = num*num*num;
		
		System.out.println("Cube of Given Number: "+cube);
		scan.close();
	}
}
