package CoreJavaAssignments;

public class MultiByExtendingThreadClass extends Thread {
	
	public void run() {
		System.out.println("thread is running");  
	}

	public static void main(String[] args) {
		MultiByExtendingThreadClass t1 = new MultiByExtendingThreadClass();
		t1.start();
		
	

	}

}
