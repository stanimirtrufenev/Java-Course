import java.util.Scanner;
import java.util.Stack;


public class Zadachka1 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter string: ");
        String sentence = input.nextLine();
        
        input.close();
        
        Stack<String> myStack = new Stack<String>();
        
        String[] parts = sentence.split(" ");
        
        for (String part : parts) {			
				myStack.push(part);
        }
        while(!myStack.isEmpty()){
			
			String current = myStack.pop();
			
			System.out.print(current + " ");
		}

	}

}
