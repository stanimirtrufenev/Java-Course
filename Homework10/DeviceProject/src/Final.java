
public class Final {

	public static void main(String[] args) {
		DeviceFactory deviceFactory = new DeviceFactory();

	      Device device1 = deviceFactory.getDevice("LAPTOP");

	      device1.say("X550", "Asus");
	}

}
