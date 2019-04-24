import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a numeric grade: ");
		
		int grade = scan.nextInt();
		
		if (grade >= 85){
			System.out.println("A");
			
		}
		
		else if (grade >= 70){
			System.out.println("B");
			
		}
		
		else if (grade >= 60){
			System.out.println("C");
			
		}
		
		else if (grade >= 50){
			System.out.println("D");
			
		}
		
		else {
			
			System.out.println("F");
		}
		
		System.out.println("Goodbye!");
		
		scan.close();
		
		
		

	}

}
