package java_method;

public class Methods {

	public static void main(String[] args) {
		
		Object obj = new Object();
		System.out.println(obj.toString()); // toString() Object를 문자열로 표현
		
//		----------------------------------------------------------------------------------------
		
		long time1 = System.currentTimeMillis(); 
		int sum = 0;
		
		for (int i = 1 ; i <= 1000000; i++) {
			sum = sum + i;
		}
		
		long time2 =  System.currentTimeMillis();

		System.out.println("1 ~ 1000000까지 합 "+sum);
		System.out.println("계산에 " + (time2 - time1) + "밀리초가 소요되었습니다.");
		
//		----------------------------------------------------------------------------------------
		
		String ssn = "7345354252";
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}else
		{
			System.out.println("주민번호 자리수가 틀립니다.");
		}
		
//		----------------------------------------------------------------------------------------
		
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "Java"); // 자바라는 것을 Java로 바꾼다
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
//		----------------------------------------------------------------------------------------
		
		String ssn2 = "880815-1234567 ";
		
		String firstNum = ssn2.substring(0,6); // 880815 : 0 ~ 6까지
		System.out.println(firstNum);
		
		String secondNum = ssn2.substring(3); // 815-1234567 : 3개 제외한 모든 것 (공백 들어가있음)
		System.out.println(secondNum);
		
//		----------------------------------------------------------------------------------------
		
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2)); // false
		
//		----------------------------------------------------------------------------------------
		
		String lowerStr1 = str1.toUpperCase(); // 대문자 변환 JAVA PROGRAMING
		System.out.println(lowerStr1);
		
		String lowerStr2 = str2.toLowerCase(); // 소문자 변환 java programing
		System.out.println(lowerStr2);

//		----------------------------------------------------------------------------------------
		
		String tel1 = " 02"; 
		String tel2 = "123   ";
		String tel3 = "    1234  ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim(); // 공백 없애기
		
		System.out.println(tel); //021231234

//		----------------------------------------------------------------------------------------
		
		String str3 = String.valueOf(10); // 문자열로 변환
		String str4 = String.valueOf(10.5); // 문자열로 변환
		String str5 = String.valueOf(true); // 문자열로 변환
		
		System.out.println(str3); // 10
		System.out.println(str4); // 10.5
		System.out.println(str5); // true
		
//		----------------------------------------------------------------------------------------
		
		String str6 = "togeth";
		String str7 = "er";
		
		String str8 = str6.concat(str7); // together
		System.out.println(str8);
		
		String str9 = str6 + str7; // together
		System.out.println(str9);
		
		
	}

}
