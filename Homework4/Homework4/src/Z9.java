import java.util.Scanner;

public class Z9 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter size of the matrix: ");
        int a = input.nextInt();
        
        input.close();
        
        int[][] matrix = new int[a][a];
        
        for(int num =1; num <= a*a; num++){
            for(int row = 0; row < a; row++){
    			for(int col = 0; col < a; col++){
    				matrix[row][col] = num;
    				num++;
    			}
            }
        }
        for(int row = 0; row < a; row++){
			for(int col = 0; col < a; col++){
				System.out.print(matrix[col][row] + "\t");
			}
			System.out.println();
		}

	}

}