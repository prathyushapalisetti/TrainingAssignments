package CoreJavaAssigments;
import java.util.Scanner;
public class Temparature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in degrees ");
		int celcius = sc.nextInt();
		double fahrenheit = (9.0/5.0)*celcius+32;
		System.out.println("Fahrenheit value of "+celcius+ "C is "+fahrenheit+"F");
	}
}

	