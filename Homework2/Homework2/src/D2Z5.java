import java.util.Scanner;  

public class D2Z5 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter the first wall: ");
        int a = input.nextInt();
        
        System.out.println("Please enter the second wall: ");
        int b = input.nextInt();
        
        System.out.println("Please enter the third wall: ");
        int c = input.nextInt();
        
        input.close();
        
        if(a<b+c && b<a+c && c<a+b){
        	System.out.println("This triangle CAN be created.");
        }
        else{
        	System.out.println("This triangle CAN'T be created.");
        }

	}

}
