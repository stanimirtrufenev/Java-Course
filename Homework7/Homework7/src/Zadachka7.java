
public class Zadachka7 {

	public static void main(String[] args) {
		int number = 5;
		int factoriel = factoriel(number);
        System.out.printf("%d! = %d%n", number, factoriel);

	}
	
	public static int factoriel(int number) {
	    if (number == 0) {
	    	return 1;
	    	
	    } else {
		      return number * factoriel(number - 1);
	    }
	}
}