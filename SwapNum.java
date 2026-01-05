
public class SwapNum {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int temp = num1+num2;
		
		num1 = num2;
		num2 = temp-num2;
		System.out.println("Num1 :"+num1);
		System.out.println("Num2 :"+num2);
	}

}
