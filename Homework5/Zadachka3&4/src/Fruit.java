
public class Fruit extends Stock {
		
	public String sort;
	public int quality;
		
		public Fruit(){
			super();
			this.sort = "";
			this.quality = 0;
		}
		
		public Fruit(int price, boolean available, String sort, int quality){
			super(price, available);
			
			setSort(sort);
			setQuality(quality);
		}

		public String getSort() {
			return sort;
		}

		public void setSort(String sort) {
			this.sort = sort;
		}
		
		public int getQuality() {
			return quality;
		}

		public void setQuality(int quality) {
			this.quality = quality;
		}
		
		public void sayFruit(){
			System.out.println("The sort of the fruit is " + this.sort);
			System.out.println("The fruit has " + this.quality + " quality");
			System.out.println();
		}

}
