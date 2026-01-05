import java.util.Scanner;

public class SubjectAvg {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Marks of Subjects: ");
		System.out.println("Maths : ");
		double math = scan.nextDouble();
		
		System.out.println("physics : ");
		double physics = scan.nextDouble();
		
		System.out.println("Bio : ");
		double bio = scan.nextDouble();
		
		System.out.println("Chem : ");
		double chem = scan.nextDouble();
		
		System.out.println("Eng : ");
		double eng = scan.nextDouble();
		
		double total = math+physics+bio+chem+eng;
		double avg = total/5;
		double per = ((total/500)*100);
		
		System.out.println(avg);
		System.out.println(per);
		scan.close();
	}

}
