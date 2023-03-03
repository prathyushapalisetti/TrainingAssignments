package CoreJavaAssignments;

public class MyThread1 extends Thread {
	
PrintTable obj;
	
	public MyThread1(PrintTable obj) {
		this.obj = obj;
	}
	
	public void run() {
		PrintTable t = new PrintTable();
		t.print(5);
		
	}
}


	
