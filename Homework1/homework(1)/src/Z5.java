import java.util.Scanner;

public class Z5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.println("Please enter the second number: ");
        int number2 = input.nextInt();
        
        System.out.println("Please enter the third number: ");
        int number3 = input.nextInt();
        
        System.out.println("Please enter the forth number: ");
        int number4 = input.nextInt();
        
        input.close();
		
        int sum = number1 + number2 + number3 + number4;
        System.out.print("The sum is: ");
        System.out.println(sum);

	}

}
