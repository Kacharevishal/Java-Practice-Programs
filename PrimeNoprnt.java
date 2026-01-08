
public class PrimeNoprnt {

	public static void main(String[] args) {

		int num = 100;
		
		for(int i = 0;i<=num;i++)
		{
			boolean isPrime = true;
			
			if(i <= 1)
			{
				isPrime = false;
			}
			else
			{
				for(int j = 2;j<i;j++)
				{
					if(i % j ==0)
					{
						isPrime = false;
						break;
					}
				}
			}
			if(isPrime == true)
			{
				System.out.println("Is Prime: "+i);
			}
			else
			{
				System.out.println("Is Not Prime: "+i);
			}
		}
	}

}
