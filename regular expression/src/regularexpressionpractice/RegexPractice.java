package regularexpressionpractice;
import java.util.*;
public class RegexPractice {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Number");
		String rx=sc.nextLine();
		if (rx.matches("^[4]{1}[0-9]{12}([0-9]{3})?$"))
			System.out.println("correct");
		else
			System.out.println("wrong");
     }
}
