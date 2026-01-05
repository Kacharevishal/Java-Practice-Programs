
public class SwapNum2 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		num1 = num1+num2;//30;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		
		System.out.println("Num1 :"+num1);
		System.out.println("Num2 :"+num2);
	}

}
