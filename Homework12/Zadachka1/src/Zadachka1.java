import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Zadachka1 {

	public static void main(String[] args) {
		try {
			readFile("test.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String fileName = "test1.txt";
			String data = readFile ("test.txt").toString(); 
			writeFile(fileName, data);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static String readFile(String fileName)
	        throws FileNotFoundException, IOException {
		
	    FileInputStream fileInputStream = null;
	    
	    fileInputStream = new FileInputStream(fileName);
	    
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(fileInputStream));
	    String temp = null;
	    while ((temp = buffer.readLine()) != null) {
	        System.out.println(temp);
	    }	    
	    buffer.close();
	    
	    fileInputStream.close();
	    return buffer.toString();
	}
	
	public static void writeFile(String fileName, String temp)
	        throws FileNotFoundException, IOException {
		
		FileOutputStream fileOutputStream = null;
	    
		fileOutputStream = new FileOutputStream(fileName);
	    
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
		writer.write(temp);
	        System.out.println(temp);
	   
	    
	        writer.close();
	    
	    fileOutputStream.close();
	}

}