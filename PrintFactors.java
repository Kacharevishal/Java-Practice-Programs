package practice06;

public class PrintFactors {

	public static void main(String[] args) {

		int num = -1;
		for(int i=1;i<=num;i++)
		{
			if(num % i == 0)
			{
				System.out.println("Factors OF "+num+" : "+i);
			}
		}
	}

}
