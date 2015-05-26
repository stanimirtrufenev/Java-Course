import java.util.Scanner;

public class Zadachka1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter sentence: ");
        String sentence = input.nextLine();    
        
        input.close();
        
        boolean starts = sentence.startsWith("Greeting");
		System.out.format("The sentance begins with thew word \"Greeting\": %s \n", starts);
		
		boolean ends = sentence.endsWith(".");
		
		System.out.format("The sentance ends with \".\": %s \n", ends);
		
		boolean contains = sentence.contains("water");
		
		System.out.format("The sentance contains the word \"water\": %s \n", contains);

	}

}
