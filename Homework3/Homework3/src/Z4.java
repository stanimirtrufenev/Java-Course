import java.util.Scanner;

public class Z4 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number for N: ");
        int N = input.nextInt();
        
        System.out.println("Please enter number for K: ");
        int K = input.nextInt();
        
        input.close();

        int p = 1;
        int r = 1;
        
        if(1 < K && K < N){
        	for(int i = 1; i <= K; i++){
        		p *= i;
        	}
        	for(int a = 1; a <= N; a++){
        		r *= a;
        	}
        	
        	int c = r / p;
        	System.out.println("N!/K!= " + c);
        }
        else{
        	System.out.println("Try with another numbers. ");
        }

	}

}
