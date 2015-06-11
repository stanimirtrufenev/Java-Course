class Threading {

	synchronized void one() {
		for(int i = 0; i <= 50000; i++){
		if (i == 25001) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		System.out.println(i);
	}
	}

	synchronized void two() {
		for (int i = 0; i < 20; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println("Running...");
			notify();
		}
	}
}

class TwoThreads {
	public static void main(String args[]) {
		final Threading c = new Threading();

		new Thread() {
			public void run() {
				c.one();
			}
		}.start();

		new Thread() {
			public void run() {
				c.two();
			}
		}.start();

	}
}