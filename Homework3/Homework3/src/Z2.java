import java.util.Scanner;

public class Z2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number for N: ");
        int n = input.nextInt();
        
        input.close();
        
        for(int i = 1; i < n; i++){
        	if((i % 21) != 0){
        		System.out.print(i + " ");
        	}
        }

	}

}
