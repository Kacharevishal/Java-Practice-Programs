import java.util.Scanner;

public class ArathmaticOp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Integer Numbers: ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int add = num1 + num2;
		int sub = num1 - num2;
		int div = num1 / num2;
		int mul = num1 * num2;
		
		System.out.println("Addition of "+num1+" + "+num2+" = "+add);
		System.out.println("Substraction of "+num1+" - "+num2+" = "+sub);
		System.out.println("Multi of "+num1+" * "+num2+" = "+mul);
		System.out.println("Div of "+num1+" / "+num2+" = "+div);
		scan.close();
	}

}
