import java.util.Scanner;

public class Z5 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number for a: ");
        int a = input.nextInt();
        
        System.out.println("Please enter number for b: ");
        int b = input.nextInt();
        
        input.close();
        
        if(b > a){
        	for(int i = a; i < b; i++){
        		if(i % 3 == 0){
        			System.out.println(i);
        		}
        	}
        }
        else{
        	System.out.println("Try with another numbers.");
        }

	}

}
