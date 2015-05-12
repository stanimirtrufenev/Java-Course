
public class Z1 {

	public static void main(String[] args) {
		int[] ourArr = {1, 4, 5, 8, 11, 34};
		
		int a = 0;
		
		for(int i = 0; i < ourArr.length; i++){
			if(ourArr[i] % 2 == 0){
				a = a + ourArr[i];
			}
		}
		
		System.out.println("The sum is: " + a);

	}

}
