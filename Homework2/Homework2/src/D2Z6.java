import java.util.Scanner; 

public class D2Z6 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please your points: ");
        int a = input.nextInt();
        
        input.close();
        
        if(a < 1 || a > 9){
        	System.out.println("Incorrect points! ");
        }
        
        else if(a >= 1 && a <= 3){
        	a = a * 5;
        	System.out.println("Your real points are: ");
        	System.out.print(a);
        }
        
        else if(a >= 4 && a <= 6){
        	a = a * 10;
        	System.out.println("Your real points are: ");
        	System.out.print(a);
        }
        
        if (a >= 7 && a <= 9){
        	a = a * 50;
        	System.out.println("Your real points are: ");
        	System.out.print(a);
        }

	}

}
