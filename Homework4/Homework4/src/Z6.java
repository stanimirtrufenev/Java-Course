
public class Z6 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][6];
		int num = 30;
		
		for(int row = 0; row < 5; row++){
			for(int col = 0; col < 6; col++){
				arr[row][col] = num;
				num--;
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
		
	} 
}