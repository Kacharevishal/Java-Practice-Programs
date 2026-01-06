package practice06;

public class ConvertDaysIntoYears {

	public static void main(String[] args) {
		
		int days = 555;
		int years = 365;
		int weeks = 7;
		
		int ansInDays = days/weeks;
	    int ansInYear = days/years;
		
		System.out.println("In Weeks: "+ansInDays);
		System.out.println("In Year: "+ansInYear);
		

	}

}
