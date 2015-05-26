import java.util.Scanner;

public class Zadachka3 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter a word: ");
        String word = input.nextLine();    
        
        input.close();
        
        printWord(word);
	
	}
	
	public static void printWord(String word){
		for (int i = 0; i < word.length(); i++) {
			System.out.printf("%c",word.charAt(word.length()- 1 - i));
		
		}
	}

}
