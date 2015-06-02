import java.util.ArrayDeque;

public class Zadachka4 {

	public static void main(String[] args) {
        
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        int[] parts = {1, 2, 3, 4, 5, 6};
        
        for (int part : parts) {
			if(part % 2 == 0){
				
				deque.addFirst(part);	
			}
			else{
				deque.addLast(part);
			}
        }
			
			while(!deque.isEmpty()){
				
				Integer current = deque.pop();
				
				System.out.print(current + " ");
			}

	}

}
