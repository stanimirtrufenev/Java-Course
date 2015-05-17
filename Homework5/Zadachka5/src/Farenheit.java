
public class Farenheit {
	public double fahren;
	
	public Farenheit(){
		this.fahren = 0;
	}
	
	public Farenheit(double celsius){
		this();
		this.fahren = celsius * 1.8 + 32;
	}
	
	public void say(){
		System.out.println("Converted to Fahrenheit is: " + this.fahren);
	}

}
