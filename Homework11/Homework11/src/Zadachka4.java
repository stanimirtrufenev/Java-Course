import java.util.Scanner;

public class Zadachka4 {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int index1 = 0;
		int index2 = 0;
		Scanner input = new Scanner(System.in, "UTF-8");
		 
		for(int i = 1; i <= 10; i++){	
		System.out.println("Please enter number " + i + " :");
        int number = input.nextInt();
        
        if(number % 2 == 0){
        	arr1[index1] = number;
        	index1++;
        }
        if(number % 2 != 0){
        	arr2[index2] = number;
        	index2++;
        }
		}
        input.close();
        
        int temp;   
        for (int i=1; i<arr1.length; i++)
        {
            for(int j=0; j<arr1.length-i; j++)
            {
                if (arr1[j] > arr1 [j+1])
                {
                    temp = arr1 [j];
                    arr1 [j] = arr1 [j+1];
                    arr1 [j+1] = temp;
                }
            }
        }
        System.out.println("The firts array: ");
        for(int a = 0; a < arr1.length; a++){
        	if(arr1[a] != 0){
        	System.out.print(arr1[a] + " ");
        	}
        }
        
        System.out.println();
        
        int temp1;   
        for (int i=1; i<arr2.length; i++)
        {
            for(int j=0; j<arr2.length-i; j++)
            {
                if (arr2[j] < arr2 [j+1])
                {
                    temp1 = arr2 [j];
                    arr2 [j] = arr2 [j+1];
                    arr2 [j+1] = temp1;
                }
            }
        }
        System.out.println("The second array: ");
        for(int b = 0; b < arr2.length; b++){
        	if(arr2[b] != 0)
        	System.out.print(arr2[b] + " ");
        }

	}

}
