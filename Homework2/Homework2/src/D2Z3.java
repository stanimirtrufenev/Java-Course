import java.util.Scanner;

public class D2Z3 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter the firts number: ");
        int firstNum = input.nextInt();
        
        System.out.println("Please enter the second number: ");
        int secondNum = input.nextInt();
        
        System.out.println("Please enter the third number: ");
        int thirdNum = input.nextInt();
        
        input.close();
        
        System.out.println("The biggest number is: ");
        
        if(firstNum >= secondNum && firstNum >= thirdNum){
        	System.out.print(firstNum);
        }
        
        if(secondNum > firstNum && secondNum >= thirdNum){
        	System.out.print(secondNum);
        }
        
        if(thirdNum > firstNum && thirdNum > secondNum){
        	System.out.print(thirdNum);
        }

	}

}
