import java.util.Random;


class ThreadPool1 implements Runnable{
	private String message;

	public ThreadPool1(String s) {
		this.message = s;
	}

	public void run() {
		System.out.println(message + Thread.currentThread().getName());
		processMessage();
		System.out.println("The thread complete!");
	}
	

	private void processMessage() {
		Random rand = new Random();	
		int Low = 1000;
		int High = 10000;
		int randomInt = rand.nextInt(High-Low) + Low;
		try {
			Thread.sleep(randomInt);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
