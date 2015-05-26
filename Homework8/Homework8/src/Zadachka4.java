import java.util.Scanner;

public class Zadachka4 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter a word: ");
        String word = input.nextLine();    
        
        System.out.println("Please enter Sentence: ");
        String sentence = input.nextLine();  
        
        input.close();
        
        String modified = sentence.replace(word, word.toUpperCase());
        System.out.println(modified);

	}

}
