import java.util.Scanner;

public class Z3 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number for N: ");
        int n = input.nextInt();
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i <= n; i++){
        	System.out.println("Please enter number: " + " " + i);
        	int current = input.nextInt();
        	
        	if(current > max){
        		max = current;
        	}
        	
        	if(current < min){
        		min = current;
        	}

        }
        System.out.println("The biggest number is: " + max);
        System.out.println("The smallest number is: " + min);
       
        input.close();
	}

}
