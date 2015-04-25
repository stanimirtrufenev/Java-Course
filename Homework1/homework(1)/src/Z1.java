import java.util.Scanner;

public class Z1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter length: ");
		double longWall = input.nextDouble();
		
		System.out.println("Please enter width: ");
		double shortWall = input.nextDouble();
		
		
		double c = (double)longWall * shortWall;
		
		System.out.print("The area of the rectangle is: ");
		System.out.println(c);
		
		input.close();

	}

}
