package practice06;

public class SumOfEvenNo {

	public static void main(String[] args) {

		int num = 4285;	
		int sum = 0;
		
		for(;num > 0;num = num/10)
		{
			int digit = num % 10;
			if(digit % 2 == 0)
			{
				sum += digit;
			}
		}
		System.out.println("Sum OF all Even Digits: "+sum);
	}
}
