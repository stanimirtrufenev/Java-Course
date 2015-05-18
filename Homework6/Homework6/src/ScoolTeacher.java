
public class ScoolTeacher extends Teacher{
	public String scoolclass;
	
	public ScoolTeacher(){
		super();
		this.scoolclass = "";
	}
	
	public ScoolTeacher(String firstName, String lastName, int years, int workExp, String subject, String scoolclass){
		super(firstName, lastName, years, workExp, subject);
		
		setScoolClass(scoolclass);
	}

	public String getScoolClass() {
		return scoolclass;
	}

	public void setScoolClass(String scoolclass) {
		this.scoolclass = scoolclass;
	}
	
	public void sayClass(){
		System.out.println("This class is " + this.scoolclass);
		System.out.println("I can check your homework.");
		
	}
	
	public void sayJoke(){
		System.out.println("I will tell you some jokes.");
	}

}
