import java.util.Scanner;

public class Z2 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number for length of the arrey: ");
        int a = input.nextInt();
        
        input.close();

        int[] F = new int[a];
        
        F[0] = 1;
        F[1] = 1;
        
        for(int i = 2; i < a; i++){
        	F[i] = F[i-2] + F[i-1];
        }
        
        for(int c = 0; c < a; c++){
        	System.out.print(F[c] + " ");
        }
	}

}
