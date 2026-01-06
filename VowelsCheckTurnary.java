package practice06;

public class VowelsCheckTurnary {

	public static void main(String[] args) {

		char ch = 'a';
		
		String str =ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? "vowels":"Consonant";
		
		System.out.println(str);
	}

}
