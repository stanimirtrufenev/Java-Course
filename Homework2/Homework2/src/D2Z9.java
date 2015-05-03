import java.util.Scanner;

public class D2Z9 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter the first number: ");
        int a = input.nextInt();
        
        System.out.println("Please enter the second number: ");
        int b = input.nextInt();
        
        System.out.println("Please enter the third number: ");
        int c = input.nextInt();
        
        System.out.println("Please enter the fourth number: ");
        int d = input.nextInt();
        
        System.out.println("Please enter the fifth number: ");
        int e = input.nextInt();
        
        input.close();
        
        if(a >= b && a >= c && a >= d && a >= e){
        	System.out.println(a);
        }
        
        if(b > a && b >= c && b >= d && b >= e){
        	System.out.println(b);
        }
        if(c > a && c > b && c >= d && c >= e){
        	System.out.println(c);
        }
        if(d > a && d > b && d > c && d >= e){
        	System.out.println(d);
        }
        if(e > a && e > b && e > c && e > d){
        	System.out.println(e);
        }
	}

}
