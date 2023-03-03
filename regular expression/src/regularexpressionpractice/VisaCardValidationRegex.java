package regularexpressionpractice;

public class VisaCardValidationRegex {

	public static void main(String[] args) {
		
		String str = "4125369875623365";
		checkValue(str);
	}
		
		public static void checkValue(String value) {
			if(value.matches("^[4]{1}[0-9]{15}+"))
				System.out.println("true");
			else
				System.out.println("false");

	}

}

