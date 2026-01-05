import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Radius of Circle: ");
		double radius = scan.nextDouble();
		double pi = 3.141;
//		System.out.println("Area Of Circle = "+Math.PI*radius*radius);
		System.out.println("Area Of Circle = "+pi*radius*radius);
		scan.close();
	}

}
