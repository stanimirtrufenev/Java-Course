import java.util.Random;

public class Zadachka4 {

	public static void main(String[] args) {
        Random rand = new Random();
        
        for(int i = 1; i <= 20; i++){
		
		int firstInt = rand.nextInt(100);
		
		int secondInt = rand.nextInt(100);
		
		int thirdInt = rand.nextInt(100);
		
		int multiply = threeNumbers(firstInt, secondInt, thirdInt);
		
		System.out.print(i + ")" + firstInt + "*" + secondInt + "*" + thirdInt + " = " + multiply);
		System.out.println();
        }

	}

	public static int threeNumbers(int firstInt, int secondInt, int thirdInt){
		int multiply = firstInt * secondInt * thirdInt;
		return multiply;
	}

}
