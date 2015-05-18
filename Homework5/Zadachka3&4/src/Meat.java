
public class Meat extends Stock {
		
	public String type;
	public int calories;
		
		public Meat(){
			super();
			this.type = "";
			this.calories = 0;
		}
		
		public Meat(int price, boolean available, String type, int calories){
			super(price, available);
			
			setType(type);
			setCalories(calories);
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		public int getCalories() {
			return calories;
		}

		public void setCalories(int calories) {
			this.calories = calories;
		}
		
		public void sayMeat(){
			System.out.println("The type of the meat is " + this.type);
			System.out.println("The meat has " + this.calories + " calories.");
			System.out.println();
		}
}