package practice06;

public class SumOfEvenNo2 {

	public static void main(String[] args) {

		int num = 3456352;
		int sum = 0;
		
		while(num > 0)
		{
			int rem = num % 10;
			
			if(rem % 2 == 0)
			{
				sum += rem;
			}
			num = num/10;
		}
		System.out.println("Sum Of Even Digits: "+sum);
	}
}
