package homeWorkOne;
import java.util.Scanner;

public class HomeWorkOne {

	public static void main(String[] args) {
		
		getdoubleforuser();
		
		
		
		
		
	
	
		
		
	
		
	}


	public static void getdoubleforuser() {
		double userval= 0;
		Scanner input = new Scanner(System.in);
		while (userval <100 || userval > 200) {
			System.out.println("Enter in a double that is between 100 and 200");
			while(!input.hasNextDouble()) {
				input.nextLine();
				System.out.println("Invalid input enter a double");
				
			}
		userval= input.nextDouble();
		
		System.out.println(userval);
			
		}
	
}
}


	


