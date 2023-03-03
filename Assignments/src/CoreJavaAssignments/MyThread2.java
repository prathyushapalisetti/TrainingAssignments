package CoreJavaAssignments;

public class MyThread2 extends Thread {
	
	PrintTable obj;
	
	public MyThread2(PrintTable obj) {
		this.obj = obj;
	}
	
	public void run() {
		PrintTable t = new PrintTable();
		t.print(100);
	}

}
