import java.util.Scanner;

public class Zadachka2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter the first number: ");
        int a = input.nextInt();
        
        System.out.println("Please enter the second number: ");
        int b = input.nextInt();
        
        System.out.println("Please enter the third number: ");
        int c = input.nextInt();
        
        int v = maxNumber(a, b);
        int r = maxNumber(v, c);
        System.out.println("The max number is: " + r);      
        
        input.close();
	}
	
	public static int maxNumber(int first, int second){
		if(first > second){
			return first;
		}
		else{
			return second;
		}
	}

}
