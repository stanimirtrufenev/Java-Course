
public class Policeman extends Employee {
	public String rang;

	
	public Policeman(){
		super();
		this.rang = "";
	}
	
	public Policeman(int workHours, int salary, String rang){
		super(workHours, salary);
		
		setRang(rang);
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}
	
	public void sayRang(){
		System.out.println("My rang is " + this.rang + ".");
	}
}
