import java.util.Scanner;

public class Z6 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter radius: ");
		double radius = input.nextDouble();
        
        input.close();
        
        double per = 2 * 3.14 * radius;
        System.out.print("The perimetur is: ");
        System.out.println(per);

        double area = 3.14 * radius * radius;
        System.out.print("The area is: ");
        System.out.println(area);
	}

}
