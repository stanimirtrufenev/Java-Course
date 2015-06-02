
public class Laptop implements Device{

	@Override
	   public void say(String model, String brand) {
		System.out.println("The model of this device is " + this.model());
		System.out.println("The brand of this device is " + this.brand());
	      System.out.println("Inside Laptop::say() method.");
	   }

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return null;
	}
}
