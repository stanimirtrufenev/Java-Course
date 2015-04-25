import java.util.Scanner;

public class Z7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number: ");
		 int num = input.nextInt();
		 
		 input.close();
		 
		 int c = num % 5;
		 
		 boolean divide5 = c == 0;
		 System.out.print("Chisloto se deli na 5 bez ostatuk: ");
	        System.out.println(divide5);
		
	        int d = num % 7;
			 
			 boolean divideto7 = d == 0;
			 System.out.print("Chisloto se deli na 7 bez ostatuk: ");
		        System.out.println(divideto7);

	}

}
