import java.util.Scanner;  

public class D2Z7 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter a card: ");
        String a = input.nextLine();
                                       
        input.close();
        
        if(a.equals("2")){
			System.out.println("Valid card!");
		}
		else if(a.equals("3")){
			System.out.println("Valid card!");
		}
		else if(a.equals("4")){
			System.out.println("Valid card!");
		}
		else if(a.equals("5")){
			System.out.println("Valid card!");
		}
		else if(a.equals("6")){
			System.out.println("Valid card!");
		}
		else if(a.equals("7")){
			System.out.println("Valid card!");
		}
		else if(a.equals("8")){
			System.out.println("Valid card!");
		}
		else if(a.equals("9")){
			System.out.println("Valid card!");
		}
		else if(a.equals("10")){
			System.out.println("Valid card!");
		}
		else if(a.equals("J") || a.equals("j") ){
			System.out.println("Valid card!");
		}
		else if(a.equals("Q") || a.equals("q")){
			System.out.println("Valid card!");
		}
		else if(a.equals("K") || a.equals("k")){
			System.out.println("Valid card!");
		}
		else if(a.equals("A")|| a.equals("a") ){
			System.out.println("Valid card!");
		}
		else{
			System.out.println("Invalid card!");
		}
        		
	}

}