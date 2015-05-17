
public class Cat {
	String name;
	int age;
	
	public Cat(){
		this.name = "";
		this.age = 0;
	}
	
	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void Say(){
		System.out.println("Meowww, I am " + this.name + "!");
		System.out.println("Meowww, I am " + this.age + " years old dog!");
	}

}
