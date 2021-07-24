package compare_operation;

public class CompareOperation {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		// ------------------ int형 비교연산 ------------------
		
		boolean result1 = (num1 == num2); 
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		boolean result4 = (num1 >= num2);
		boolean result5 = (num1 < num2);
		boolean result6 = (num1 > num2);
		boolean result7 = !(num1 > num2); 
		
		System.out.println("result1 = " + result1); // true
		System.out.println("result2 = " + result2); // false
		System.out.println("result3 = " + result3); // true
		System.out.println("result4 = " + result4); // true
		System.out.println("result5 = " + result5); // false
		System.out.println("result6 = " + result6); // false
		System.out.println("result7 = " + result7); // true
		
		// ------------------ char형 비교연산 ------------------
		
		char char1 = 'A'; // 65
		char char2 = 'B'; // 66
		boolean result8 = (char1 < char2);
		
		System.out.println(result8); // true

	}

}
