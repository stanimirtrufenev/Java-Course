
public class Saying {

	public static void main(String[] args) {
		
		Cat[] arr = new Cat[10];
		arr[0] = new Cat("Johnny", 5);
		arr[1] = new Cat("Bravo", 7);
		arr[2] = new Cat("Garfield", 8);
		arr[3] = new Cat("Koko", 15);
		arr[4] = new Cat("Roko", 2);
		arr[5] = new Cat("DenisBelqta", 3);
		arr[6] = new Cat("Misho", 14);
		arr[7] = new Cat("Kleopatra", 13);
		arr[8] = new Cat("Zack", 9);
		arr[9] = new Cat("Jack", 1);
		
		for(int i = 0; i < 10; i++){
			arr[i].Say();
		}
		

	}

}
