
public abstract class Stock {
	public int price;
	public boolean available;
	
	public Stock(){
		this.price = 0;
		this.available = false;
		}
		
		public Stock(int price, boolean available){
			this();
			
			setPrice(price);
			setAvailable(available);
		}
		
		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public boolean getAvailabley() {
			return available;
		}

		public void setAvailable(boolean available) {
			this.available = available;
		}
		
		public void say(){
			System.out.println("The price of the product is " + this.price + ".");
			System.out.println("The item is available - " +  this.available + ".");
		}

		public void sayMeat() {
			
		}

		public void sayVegetable() {
			
		}

		public void sayFruit() {
			
		}

		public void sayDrinks() {
			
		}

		public void sayDessert() {
			
		}

}
