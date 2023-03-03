package exceptionhandlingpractice;

public class CustomException {
    public static void main(String[] args) {
		
		try {
			checkAge(30);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 18)
			// throw the exception
			throw new InvalidAgeException("you are not eligible for driving");
		else
			System.out.println("you are eligible for driving");
	}
	
}
	
	