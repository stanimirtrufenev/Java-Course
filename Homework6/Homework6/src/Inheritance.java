
public class Inheritance {

	public static void main(String[] args) {
		
		Teacher Mrs = new Teacher("Mariq", "Teneva", 25, 5, "English");
		Mrs.greet();
		Mrs.sayTeaching();
		Mrs.checking();
		Mrs.hello();
		Mrs.goodbye();
		
		System.out.println();
		
		Lecturer John = new Lecturer("John", "Ivanov", 34, 10, "Harvard");
		John.greet();
		John.sayWhere();
		John.Lchecking();
		John.teaching();
		John.sayHi();
		
		System.out.println();
		
		Professor Bill = new Professor("Bill", "Gates", 56, 34, "SOU Neofit Rilski", "Dekan");
		Bill.greet();
		Bill.sayWhere();
		Bill.sayExperience();
		Bill.sayMakeExam();
		
		System.out.println();
		
		Assistant Michael = new Assistant("Michael", "Jackson", 45, 12, "Tu-Sofia", true);
		Michael.greet();
		Michael.sayWhere();
		Michael.sayChief();
		Michael.sayScience();
		Michael.sayCheckExam();
		
		System.out.println();
		
		ScoolTeacher Elena = new ScoolTeacher("Elena", "Tisheva", 28, 6, "Math", "2A");
		Elena.greet();
		Elena.sayTeaching();
		Elena.sayClass();
		Elena.sayJoke();
		
		System.out.println();
		
		CollegeTeacher Dimitar = new CollegeTeacher("Dimitar", "Stoqnov", 19, -1, "Chemistry", "305 rooms and 34 toilets.");
		Dimitar.greet();
		Dimitar.sayTeaching();
		Dimitar.sayCollege();
		
	}

}
