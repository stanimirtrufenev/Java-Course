import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Test {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(7);
		for (int i = 0; i < 5; i++) {
			Runnable worker = new ThreadPool1("The thread is started!");
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
	}

	}


