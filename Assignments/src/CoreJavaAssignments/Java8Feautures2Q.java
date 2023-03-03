package CoreJavaAssignments;
import java.util.Arrays;


public class Java8Feautures2Q {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] result = multipleBy10(numbers);
		System.out.println("Original array: " + Arrays.toString(numbers));
		System.out.println("Modified array: " + Arrays.toString(result));

	}
	
	public static int[] multipleBy10(int[] numbers) {
		return Arrays.stream(numbers).map(n -> n > 7 ? n * 10 : n).toArray();
	}

}
