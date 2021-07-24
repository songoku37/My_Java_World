package casting_methods;

public class CastingMethods {

	public static void main(String[] args) {

		System.out.println("*********** 문자열 -> 기본타입(정수, 실수) 변환Test ******");
		
		int value1 = Integer.parseInt("10");
		
		double value2 = Double.parseDouble("3.14");
		
		System.out.println("Value1 : " + value1);
		System.out.println("Value2 : " + value2);
		
		System.out.println("*********** 기본타입(정수, 실수) -> 문자열 변환Test ******");
		
		String str1 = String.valueOf(10); 
		String str2 = String.valueOf(10.5);
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("*********** 객체 -> 문자열 변환Test ******");
		
		Integer obj1 = 300;
		Double obj2 = 111.11;
		
		String str3 = Integer.toString(obj1);
		String str4 = Double.toString(obj2);
		
		System.out.println(str3);
		System.out.println(str4);

	}

}
