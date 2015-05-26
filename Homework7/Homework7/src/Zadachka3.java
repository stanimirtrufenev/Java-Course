import java.util.Scanner;

public class Zadachka3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter name: ");
        String name = input.nextLine();
        
        input.close();
        
        print(name);

	}
	
	public static void print(String name){
		System.out.println("Greeting " + name + " !");
	}

}
