package Inheritance_super;

public class Teacher extends People{
	String name ="Teacher";
	
	void childMethod() {
		System.out.println("this.x(Teacher)" + this.name);
		System.out.println("super.x(People)" + super.name);
	}
}
