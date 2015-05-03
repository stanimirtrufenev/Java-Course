import java.util.Scanner;

public class D2Z2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter the firts real number: ");
        double firstReal = input.nextDouble();
        
        System.out.println("Please enter the second real number: ");
        double secondReal = input.nextDouble();
        
        input.close();
        
        System.out.println("The sign is: ");
        
        if(firstReal < 0 && secondReal > 0){
        	System.out.print("-");
        }
        
        if(firstReal > 0 && secondReal < 0){
        	System.out.print("-");
        }
        
        if(firstReal < 0 && secondReal < 0){
        	System.out.print("+");
        }
        
        if(firstReal > 0 && secondReal > 0){
        	System.out.print("+");
        }

	}

}
