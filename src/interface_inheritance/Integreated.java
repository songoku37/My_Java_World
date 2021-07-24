package interface_inheritance;

public class Integreated implements Animal, Human{
	String name;
	int age;
	String sex;
	String species;
	
	public Integreated(String name, int age , String sex , String species) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.species = species;
	}

	@Override
	public void species() {
		System.out.println("이 동물은 " + this.species);
	}

	@Override
	public void sex() {
		System.out.println("성별은 " + this.sex);
		
	}

	@Override
	public void name() {
		System.out.println("이름은 " + this.name);
	}

	@Override
	public void age() {
		System.out.println("나이는 " + this.age);
	}
}
