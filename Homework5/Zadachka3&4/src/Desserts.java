
public class Desserts extends Stock {
	public String taste;
	public int sugar;
	
	public Desserts(){
		super();
		this.taste = "";
		this.sugar = 0;
	}
	
	public Desserts(int price, boolean available, String taste, int sugar){
		super(price, available);
		
		setTaste(taste);
		setSugar(sugar);
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	public void sayDessert(){
		System.out.println("The name of the dessert is " + this.taste);
		System.out.println("The dessert has " + this.sugar + " grams of sugar");
		System.out.println();
	}

}
