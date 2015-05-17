
public class Drinks extends Stock {

	public String withTaste;
	public int amount;
	
	public Drinks(){
		super();
		this.withTaste = "";
		this.amount = 0;
	}
	
	public Drinks(int price, boolean available, String WithTaste, int amount){
		super(price, available);
		
		setWithTaste(withTaste);
		setAmount(amount);
	}

	public String getWithTaste() {
		return withTaste;
	}

	public void setWithTaste(String withTaste) {
		this.withTaste = withTaste;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void sayDrinks(){
		System.out.println("The drink has taste of " + this.withTaste);
		System.out.println("The amount of the drink is " + this.amount);
		System.out.println();
	}
}
