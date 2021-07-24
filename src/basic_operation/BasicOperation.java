package basic_operation;

public class BasicOperation {

	public static void main(String[] args) {
		int v1 = 3;
		int v2 = 10;
		
		// 더하기 연산
		int result = v1 + v2;
		System.out.println("result : " + result); // 13
		
		// 빼기 연산
		result = v1 - v2;
		System.out.println("result : " + result); // -7
		
		// 곱하기 연산
		result = v1 * v2;
		System.out.println("result : " + result); // 30

		// 나머지 연산
		result = v1 % v2; 
		System.out.println("result : " + result); // 3
		
		// 나누기 연산
		double result2 = (double)(v1 / v2);
		System.out.println("result : " + result2); // 0.0
		
	}

}
