package CoreJavaAssigments;
import java.util.Scanner;
/*
 * SimpleInterest program
 */
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the principal amount");
		double principalAmount = sc.nextDouble();
		System.out.println("Enter the number of the years");
		int years = sc.nextInt();
		System.out.println("Enter the rate of interest");
		float rateofInterest = sc.nextFloat();
		
		double simpleInterest = (principalAmount*years*rateofInterest)/100;
		System.out.println("Simple Interest = "+simpleInterest);
		System.out.println("Total amount with Interest = "+(principalAmount+simpleInterest));
	}
	
}
