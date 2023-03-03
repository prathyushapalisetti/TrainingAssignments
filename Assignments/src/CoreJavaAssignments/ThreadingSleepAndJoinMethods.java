package CoreJavaAssignments;

public class ThreadingSleepAndJoinMethods extends Thread {
	
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getId() + " is running");
		}
	}

	public static void main(String[] args) {
		
		ThreadingSleepAndJoinMethods t1 = new ThreadingSleepAndJoinMethods();
		ThreadingSleepAndJoinMethods t2 = new ThreadingSleepAndJoinMethods();
		ThreadingSleepAndJoinMethods t3 = new ThreadingSleepAndJoinMethods();
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
		

	}

}
