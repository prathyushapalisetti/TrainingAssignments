package regularexpressionpractice;

public class RegularExpressionConditions {

	public static void main(String[] args) {
		
		String str = "Apple";
		checkValue(str);
	}
	
	public static void checkValue(String value) {
		if(value.matches("^[a-z-A-Z]+[a-zA-Z]$+"))
			System.out.println("true");
		else
			System.out.println("false");
    }
}

// 1) value should contain only alphabets a-z A-Z -> ^[a-z]+
// 2) value should contain only numbers 1-9 -> ^[1-9]+
// 3) alphabets + numbers -> ^[a-z A-Z 0-9]+
// 4) value starts with alphabet, ends with alphabet -> ^[a-z-A-Z]+[a-zA-Z]$