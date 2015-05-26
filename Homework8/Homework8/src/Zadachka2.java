import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Zadachka2 {

	public static void main(String[] args) {
		readFile("countries.txt");
		
		String filePath = "cities.txt";
		
		try {
			
			FileWriter fileStream = new FileWriter(filePath);
			
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			Scanner input = new Scanner(System.in, "UTF-8");
			
			System.out.println("Please enter city: ");

			
			for (int i = 0; i < 5; i++) {
		        String city = input.nextLine();    
		       
				writer.write(city);
				writer.newLine();
				
			}
			
			writer.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("The file is success.");
	}


	
	public static void readFile(String path){
		try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					String line = bufferedReader.readLine();
					System.out.println(line);
			}
			
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

}
