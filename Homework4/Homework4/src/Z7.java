import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in, "UTF-8");
    	
    	System.out.println("How many numbers do you want to enter: ");
        int a = input.nextInt();
        
        int[] arr = new int[a];
        
        System.out.println("Please enter" + " " + a + " " + "numbers");
        
        for(int i = 0; i < a; i++){
        	arr[i] = input.nextInt();
        }
        
        System.out.println("Which number do you want to find: ");
        int num = input.nextInt();
        
        input.close();
        
        int first = 0;
        int last = a - 1;
        int middle = (first + last) / 2;
        
        while(first <= last){
        	if(arr[middle] < num){
        		first = middle + 1;
        	}
        	else if(arr[middle] == num){
        		System.out.println(middle + 1);
        		break;
        	}
        	else{
        		last = middle +1;
        	}
        	
        	middle = (first + last) / 2;
        }
        
        if(first > last){
        	System.out.println(num + " " + "is not found in the arrey.");
        }
        
    }
 }