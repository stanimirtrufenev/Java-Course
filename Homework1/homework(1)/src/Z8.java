import java.util.Scanner;

public class Z8 {

	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number: ");
		 int num = input.nextInt();
		 
		 input.close();

		 int c = num % 2;
		 
		 boolean divide5 = c == 0;
		 System.out.print("Chisloto e chetno: ");
	        System.out.println(divide5);
	        
	}

}
