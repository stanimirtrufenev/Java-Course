import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Z4 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter words: ");
        String words = input.nextLine();
        
        input.close();
        
        TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
        
        String[] parts = words.split(" ");
        
        for (String word : parts) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count + 1);
		}
		
		Set<String> wordKeys = wordsCount.keySet();
		
		System.out.println();
		
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			if(count == 1)
			System.out.printf("%s\n", word);
		}

	}

}
