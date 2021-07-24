package infix_operation;

public class InfixOperation {

	public static void main(String[] args) {
		
		int result = 0;
		
		result +=10; // result = result + 10
		System.out.println("result = " + result); // 10
		
		result -=5; // result = result - 5
		System.out.println("result = " + result); // 5

		result *=4; // result = result * 4
		System.out.println("result = " + result); // 20
		
		result /=2; // result = result / 2
		System.out.println("result = " + result); // 10
		
		result %=2; // result = result % 2
		System.out.println("result = " + result); // 0

	}

}
