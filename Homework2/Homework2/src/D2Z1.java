import java.util.Scanner;

public class D2Z1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
        
        System.out.println("Please enter an integer: ");
        int inte = input.nextInt();
        
        input.close();
        
        if(inte >= 1 && inte <= 5){
        if(inte % 2 == 0){
        	System.out.println("The number is even. ");
        }
        else{
        	System.out.println("The number is odd. ");
        }
        }

        if(inte >= 6 && inte <= 15){
        	if(inte % 3 == 0){
            	System.out.println("The number can be divided to 3 without remainder. ");
            }
            else{
            	System.out.println("The number can't be divided to 3 without remainder. ");
            }
        }
        
        else if(inte < 0){
        	System.out.println("Negative. ");
        }
        
        else if(inte > 16){
        	System.out.println("Positive. ");
        }
        
        else if(inte == 0){
        	System.out.println("The number is 0. ");
        }
	}

}