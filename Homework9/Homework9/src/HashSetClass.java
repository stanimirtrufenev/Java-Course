import java.util.HashSet;


public class HashSetClass {

	public static void main(String[] args) {
		
		Town roma = new Town("Roma", "Italy", 45000);
		System.out.println(roma.getName() + " " + roma.hashCode());
		
		Town varna = new Town("Varna", "Bulgaria", 33000);
		System.out.println(varna.getName() + " " + varna.hashCode());
		
		Town washimgton = new Town("Washington DC", "USA", 8970);
		System.out.println(washimgton.getName() + " " + washimgton.hashCode());
		
		Town paris = new Town("Paris", "France", 5600);
		System.out.println(paris.getName() + " " + paris.hashCode());
		
		Town london = new Town("London", "England", 5500);
		System.out.println(london.getName() + " " + london.hashCode());
		

		HashSet<Town> set = new HashSet<Town>();
		
		set.add(roma);
		set.add(varna);
		set.add(washimgton);
		set.add(paris);
		set.add(london);
		
		System.out.println();
		
		System.out.println(set);
		
		System.out.println();
		
		System.out.println(set.contains(varna));
		
		System.out.println();
		
		set.remove(varna);
		
		System.out.println(set);
		
	}

}