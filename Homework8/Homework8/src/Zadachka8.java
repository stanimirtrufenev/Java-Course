import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Zadachka8 {

	public static void main(String[] args) {
		String path = "WithSigns.txt";
		
		String line = null;
		
try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					line = bufferedReader.readLine();
					System.out.println(line);
					String filePath = "Without.txt";
					try {
						
						FileWriter fileStream = new FileWriter(filePath, true);
						
						BufferedWriter writer = new BufferedWriter(fileStream);
						
						String[] parts = line.split(" ");
						
						for (String part : parts) {  	 
				        part = part.replaceAll(",", " ").replace(".", " ");
				        System.out.print(part + " ");
				        writer.write(part + " ");
							
						}
						
						writer.close();
						
					} catch (Exception e) {
						System.out.println("Error while writing a file.");
						System.out.println(e.getMessage());
						System.exit(0);
					}
					
					System.out.println("The file is success.");
			}
			
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		

	}

 }

