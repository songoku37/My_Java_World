package string;

public class StringExample {

	public static void main(String[] args) {
		
		String str1 = "박은서"; 
        // stack에 str1이 저장되고 heap 에 string형태 박은서가 저장
		String str2 = "박은서";
		
		if (str1 == str2) { // heap영역에 박은서가 1개이고 공유함
			System.out.println("참조주소값이 같다");
		}else {
			System.out.println("참조주소값이 다르다");
		}
		
		String str3 = new String("박은서"); // 나중에 값이 정해지는 경우
		String str4 = new String("박은서"); 
		
		if (str3 == str4) {
			System.out.println("참조주소값이 같다");
		}else {
			System.out.println("참조주소값이 다르다"); //heap영역에 박은서가 2개임
		}
		
		if (str3.equals(str4)) { // 문자열값은 같음
		System.out.println("str3 과 str4 는 문자열이 같음");
		}

	}

}
