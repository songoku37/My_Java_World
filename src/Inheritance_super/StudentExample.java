package Inheritance_super;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동" , "123456-1234567",1);
		Student student2 = new Student();
		Teacher teacher = new Teacher();
		
		System.out.println("name : "+ student.name);
		System.out.println("ssn : " + student.ssn);		
		System.out.println("studentNo : " + student.studentNo);
		
		
		
		System.out.println();
		
		student.test(); 
		System.out.println();
		
		student2.test();
		System.out.println();
		
		teacher.childMethod();

	}

}
