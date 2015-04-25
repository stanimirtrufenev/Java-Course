import java.util.Scanner;

public class Z3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter your firstname: ");
        String firstName = input.nextLine();
        
        System.out.println("Please enter your lastname: ");
        String lastName = input.nextLine();
        
        System.out.println("Please enter your age: ");
        int years = input.nextInt();
       
        input.nextLine();
        System.out.println("Please enter your sex (M for male and F for female: ");
        String pol = input.nextLine();
        
        System.out.println("Please enter your EGN: ");
        String egn = input.nextLine();
        
        System.out.println("Please enter your telephone number: ");
        String number = input.nextLine();
        
        input.close();
        
        System.out.println("Your firstname is: " + firstName);
        System.out.println("Your lastname is: " + lastName);
        System.out.println("Your age is: " + years);
        System.out.println("Your sex is: " + pol);
        System.out.println("Your EGN is: " + egn);
        System.out.println("Your telephone number is: " + number);

	}

}
