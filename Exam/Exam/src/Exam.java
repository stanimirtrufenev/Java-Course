import java.io.BufferedWriter;
import java.io.FileWriter;


public class Exam {
	int rows;
	int cols;
	int[] oneDim;
	int[][] twoDim;

	public int[][] convert( final int[] oneDim, final int rows, final int cols ) {
	    if (oneDim.length != (rows*cols))
	        throw new IllegalArgumentException("Invalid array length");

	    int[][] multi = new int[rows][cols];
	    for ( int i = 0; i < rows; i++ )
	        System.arraycopy(oneDim, (i*cols), multi[i], 0, cols);
	    

        int num = 0;
        	for(int row = 0; row < multi.length; row++){
    			for(int col = 0; col < multi[row].length; col++){
    				multi[row][col] = multi[row][col]*num;
    				num++;
    			}
            }
        
	    
	    for(int row = 0; row < multi.length; row++){
			for(int col = 0; col < multi[row].length; col++){
					System.out.print(multi[col][row] + "\t");
				}
				System.out.println();
			}
	    
	    String filePath = "java.txt";


		try {
	
			FileWriter fileStream = new FileWriter(filePath);
			
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			 for(int row = 0; row < multi.length; row++){
					for(int col = 0; col < multi[row].length; col++){
						writer.write(multi[col][row]);
				writer.newLine();
			}
			 }
			System.out.print((int)'a');
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("The file is succes.");
	    
	    return multi;
	}
	
	public int[] convert( final int[][] twoDim ) {
	    int rows = twoDim.length, cols = twoDim[0].length;
	    int[] mono = new int[(rows*cols)];
	    for ( int i = 0; i < rows; i++ )
	        System.arraycopy(twoDim[i], 0, mono, (i*cols), cols);  
	    
	    for(int i = 0; i < mono.length; i++){
			mono[i] = mono[i] * i;
		}
	    
	    for(int i = 0; i < mono.length; i++){
	    	System.out.print(mono[i] + " ");
	    }
	    
	    String filePath = "java.txt";


		try {
	
			FileWriter fileStream = new FileWriter(filePath);
			
			BufferedWriter writer = new BufferedWriter(fileStream);
			
			for(int i = 0; i < mono.length; i++){
				writer.write(mono[i]);
				writer.newLine();
			}
			System.out.print((int)'a');
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("The file is succes.");
	
	    
	        return mono;
	}
	
}
