package casting;

public class Casting {

	public static void main(String[] args) {

		// -------------- double 형변환 -----------
		
		int v1 = 5;
		int v2 = 2;
		
		double result6 = (double) v1 / v2 ; // 형변환 (v1만 double형이 됨)
		System.out.println("result6 = "+result6); //  2.5
		
		// -------------- float 형변환 -----------
		
		double result7 = (float)(v1 / v2) ; // v1 / v2 을 먼저함
		System.out.println("result7 = "+result7); // 2.0
				
		// ------------- char형변환 ---------------
		
		int i = 65;
		char c = (char)i;
		
		System.out.println("c : " + c); // c : A

		// -------------- int 형변환 -----------
		
		int i2 = (int)c;
		System.out.println("i2 : " + i2); // i2 : 65
		
	}

}
