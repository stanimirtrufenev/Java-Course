import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Z5 {

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in, "UTF-8");
			
			System.out.println("Please enter 5 cards: ");
	        String words = input.nextLine();
	        
	        input.close();
	        
	        TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();

	        String[] parts = words.split(" ");
	        int a = parts.length;
	        
	        if(a < 5 || a > 5){
	        	System.out.println("Wrong number of cards");
	        }
	        else{
	        
	        for (String word : parts) {
	        	if(word.equals("2") || word.equals("3") || word.equals("4") || word.equals("5") || word.equals("6") || 
	        			word.equals("7") || word.equals("8") || word.equals("9") || word.equals("10") || word.equals("J") ||
	        			word.equals("Q") || word.equals("K") || word.equals("A")){
				Integer count = wordsCount.get(word);
				if (count == null) {
					count = 0; 
				}
				wordsCount.put(word, count + 1);
	        	}
	        	else{
	        		System.out.println("Wrong cards.");
	        		break;
	        	}
			}
			
			Set<String> wordKeys = wordsCount.keySet();
			
			System.out.println();
			
			for (String word : wordKeys) {
				int count = wordsCount.get(word);
				if(count == 2){
				System.out.printf("You have PAIR.\n");
				}
				else if(count == 3){
					System.out.printf("You have SET.\n");
				}
				else if(count == 4){
					System.out.printf("You have FOUR OF A KIND.\n");
				}
			}
			
	        }
	}

}
