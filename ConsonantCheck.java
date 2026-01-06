package practice06;

public class ConsonantCheck {

	public static void main(String[] args) {
		
		String str = "helloString";
		int count = 0;
	
		for(int i =0;i<str.length()-1;i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			{
				
			}
			else
			{
				count ++;
			}
				
		}
		System.out.println("Count of Vowels: "+count);

	}

}
