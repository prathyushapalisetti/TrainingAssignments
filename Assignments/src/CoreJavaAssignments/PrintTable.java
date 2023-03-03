package CoreJavaAssignments;

public class PrintTable {
	
	synchronized void print(int n) {
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i * n);
//			 try {
//	                Thread.sleep(2000);
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
			
//			}
		}
	}
	
	public static void main(String[] args) {
		
		PrintTable obj = new PrintTable();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	
	}

}
