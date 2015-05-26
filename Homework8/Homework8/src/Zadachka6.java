import java.util.Scanner;

public class Zadachka6 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter text: ");
        String text = input.nextLine(); 
        
        System.out.println("Please enter a word: ");
        String word = input.nextLine(); 
        
        input.close();
        
        String[] parts = text.split("\\.");
		for (String part : parts){
			String[] part1 = part.split(" ");
			for(String part2 : part1){
				if(part2.equals(word)){
				System.out.print(part + ".");
				}
			}
		}
    }
}
