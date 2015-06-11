import java.util.Random;


public class Zadachka1 extends Thread{
	public void run() {
		Random rand = new Random();	
		System.out.println("The thread is started!");
		int Low = 1000;
		int High = 10000;
		int randomInt = rand.nextInt(High-Low) + Low;

			try {
				Thread.sleep(randomInt);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println("The thread complete!");
		}

	public static void main(String args[]) {
		Zadachka1 t1 = new Zadachka1();
		Zadachka1 t2 = new Zadachka1();
		Zadachka1 t3 = new Zadachka1();
		Zadachka1 t4 = new Zadachka1();
		Zadachka1 t5 = new Zadachka1();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t1.setName("Stanimir Trufenev");
		System.out.println("My name is:" + t1.getName());
		t2.setName("Denis Zaimov");
		System.out.println("My name is:" + t2.getName());
		t3.setName("Dimitur Kirqkov");
		System.out.println("My name is:" + t3.getName());
		t4.setName("Nikolai Dobrev");
		System.out.println("My name is:" + t4.getName());
		t5.setName("Emanuil Georgiev");
		System.out.println("My name is:" + t5.getName());
	}
}
