import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number: ");
        int a = input.nextInt();
        
        input.close();
        
    	int[] arr = {1, 5, 7, 23, 12, 45, 7};
    	
    	for(int i = 0; i < arr.length; i++){
    		if(a == arr[i]){
    			System.out.println(i + 1);
    			break;
    		}
    		
    	}
    }
 }