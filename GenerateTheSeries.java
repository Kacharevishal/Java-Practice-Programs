
public class GenerateTheSeries {

	public static void main(String[] args) {

		// Generate The Series 1 2 3 4 5 4 3 2 1.
		
		for(int i = 1;i<=5;i++)
		{
			System.out.print(i+" ");
			if(i == 5)
			{
				for(int j = 4;j>=1;j--)
				{
					System.out.print(j+" ");
				}
			}
		}
		
		
	}

}
