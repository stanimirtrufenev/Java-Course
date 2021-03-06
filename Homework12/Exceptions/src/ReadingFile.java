import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class ReadingFile {
	public static void main(String[] args) {
		readFile("test1.txt");
	}
	public static void readFile(String path){
		String line = null;
		try{
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					line = bufferedReader.readLine();
					
					 System.out.println(line);
					 if(line.endsWith(".") || line.endsWith("!") || line.endsWith("?")){
							System.out.print("Good\n");
						}else{
							throw new SentenceNotCompletedException("The sentence is not completed!");
						}
			}
			bufferedReader.close();
		}
			catch (SentenceNotCompletedException exception) {
				System.out.println("An error: " + exception.getMessage());
			} 
			catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
			}

	}
}