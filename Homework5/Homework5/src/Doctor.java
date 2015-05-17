
public class Doctor extends Employee {
	int nightShifts;
	int dayShifts;
	
	public Doctor(){
		super();
		this.nightShifts = 0;
		this.dayShifts = 0;
	}
	
	public Doctor(int workHours, int salary, int nightShifts, int dayShifts){
		super(workHours, salary);
		
		setNightShifts(nightShifts);
		setDayShifts(dayShifts);
	}

	public int getNightShifts() {
		return nightShifts;
	}

	public void setNightShifts(int nightShifts) {
		this.nightShifts = nightShifts;
	}
	
	public int getDayShifts() {
		return dayShifts;
	}

	public void setDayShifts(int dayShifts) {
		this.dayShifts = dayShifts;
	}
	
	public void sayShifts(){
		System.out.println("I have been working" + " " + this.dayShifts + " " + "dayshifts.");
		System.out.println("I have been working" + " " + this.nightShifts + " " + "nightshifts.");
	}

}
