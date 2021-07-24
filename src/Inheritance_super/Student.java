package Inheritance_super;

public class Student extends People{
	public int studentNo = 1;
	
	public Student(String real_name, String ssn, int studentNo) {
//		this.name = name; 불가능
//		this.ssn = ssn; 불가능
//		
		super(real_name, ssn);
		// People의 메소드 People(String name , String ssn)을 호출
		this.studentNo = studentNo;
	}

	public Student() {
		this("X","X",0);
	}
	
	public void test() {
		System.out.println("부모 name : " + super.name);
		System.out.println("자식 name : " + this.name);
		
		super.name = "김철수";
		System.out.println("자식 name " + this.name);
		System.out.println("부모 name " + super.name);
		// super.name = People의 name에 접근
	}
}
