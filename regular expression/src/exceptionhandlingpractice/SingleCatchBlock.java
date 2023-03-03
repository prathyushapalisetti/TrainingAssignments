package exceptionhandlingpractice;

public class SingleCatchBlock {

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
			
		} catch (ArithmeticException | NullPointerException | NumberFormatException 
				| ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter  correct input");
		} catch (Exception e4) {
			System.out.println("please check your input values");
		}
	}

}
