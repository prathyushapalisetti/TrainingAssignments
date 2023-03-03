package CoreJavaAssignments;

public class MultiByImplementingRunnableInt implements Runnable {
	
	

	@Override
	public void run() {
		System.out.println("thread is running");
		}
	
	public static void main(String[] args) {
		MultiByImplementingRunnableInt m1 = new MultiByImplementingRunnableInt();
		Thread t1 = new Thread(m1); // new
		t1.start(); // active
		t1.start(); // cannot start a thread because it is in terminated state
	}

}


