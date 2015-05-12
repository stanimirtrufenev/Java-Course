import java.util.Scanner;

public class Z10 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter size of the matrix: ");
        int a = input.nextInt();
        
        input.close();
        
        int[][] matrix = new int[a][a];
        int k=1, c1=0, c2=a-1, r1=0, r2=a-1;
        
        while(k<=a*a)
            {
                for(int i=c1;i<=c2;i++)
                {
                	matrix[r1][i]=k++;
                }

                for(int j=r1+1;j<=r2;j++)
                {
                	matrix[j][c2]=k++;
                }

                for(int i=c2-1;i>=c1;i--)
                {
                	matrix[r2][i]=k++;
                }

                for(int j=r2-1;j>=r1+1;j--)
                {
                	matrix[j][c1]=k++;
                }

                c1++;
                c2--;
                r1++;
                r2--;
            }

        System.out.println();
        
        for(int i=0;i<a;i++)
            {
                for(int j=0;j<a;j++)
                    {
                        System.out.print(matrix[i][j]+ "\t");
                    }
             System.out.println();
            }
    }
}