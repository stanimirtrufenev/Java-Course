import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Zadachka9 {

	public static void main(String[] args) {
		String path = "ReadingFile.txt";
		
			try {
				
				FileReader fileReader = new FileReader(path);
				
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				while (bufferedReader.ready()) {
						String line = bufferedReader.readLine();
						int a = line.length();
						System.out.println(a);
						
						if(a % 2 == 0){
							String filePath = "Even.txt";
							try {
								
								FileWriter fileStream = new FileWriter(filePath, true);
								
								BufferedWriter writer = new BufferedWriter(fileStream);

									writer.write(line);
									writer.newLine();
								    writer.close();
								
							} catch (Exception e) {
								System.out.println("Error while writing a file.");
								System.out.println(e.getMessage());
								System.exit(0);
							}
							
							System.out.println("The file is succes (file1).");
						}
						else{
							String filePath2 = "Odd.txt";
							
							try {
								
								FileWriter fileStream = new FileWriter(filePath2, true);
								
								BufferedWriter writer = new BufferedWriter(fileStream);

									writer.write(line);
									writer.newLine();
								    writer.close();
								
							} catch (Exception e) {
								System.out.println("Error while writing a file.");
								System.out.println(e.getMessage());
								System.exit(0);
							}
							
							System.out.println("The file is succes (file2).");
						}
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



		
		
		