import java.util.Scanner;

public class Zadachka5 {

	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter text: ");
        String text = input.nextLine(); 
        
        System.out.println("Please enter a word: ");
        String word = input.nextLine();    
        
        input.close();
        
        String[] words = text.split(" ");
     
        for(int i=0; i<words.length; i++){
        	   if(words[i].equalsIgnoreCase(word))
        	         count++;
        	}
        System.out.println("This text has the word " + word + " " + count + " times.");
    }
}


