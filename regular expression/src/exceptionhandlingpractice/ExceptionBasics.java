package exceptionhandlingpractice;

public class ExceptionBasics {

	public static void main(String[] args) {
	
		try {
//			int div = 100 / 10;
//			System.out.println(div);
			
//			String s = null;
//			System.out.println(s.length());
			
//		    String s = "abc";
//		    int i = Integer.parseInt(s);
//		    System.out.println(i);
			
			int a[]=new int [3];
			a[0]=1;
			a[1]=1;
			a[2]=1;
			System.out.println(a[5]);
			
		} catch (ArithmeticException e) {
			System.out.println("please enter the correct input");
		} catch (NullPointerException e1) {
			System.out.println("please enter the correct lenght");
		} catch (Exception e3) {
			System.out.println("please enter the correct integer value");
			
		}
	}
}
