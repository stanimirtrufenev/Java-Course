
public class Vegetables extends Stock {

	public String colour;
	public String season;
	
	public Vegetables(){
		super();
		this.colour = "";
		this.season = "";
	}
	
	public Vegetables(int price, boolean available, String colour, String season){
		super(price, available);
		
		setColour(colour);
		setSeason(season);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	public void sayVegetable(){
		System.out.println("My colour of the vegetable is " + this.colour);
		System.out.println("It is growing in season " + this.season);
		System.out.println();
	}
}
