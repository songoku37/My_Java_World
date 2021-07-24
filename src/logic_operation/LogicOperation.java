package logic_operation;

public class LogicOperation {

	public static void main(String[] args) {
		
		int v1 = 45;
		int v2 = 55;
		
		// ------------------ if문 2번 사용 ------------------ 
		if(v1 >= 40) {
			if(v1 <= 50) {
				System.out.println("v1은 40과 50사이에 수입니다.");
			}
		}
		
		// ------------------ 논리연산자 사용 ------------------ 
		
		if(v1 >= 40 && v1 <= 50 ) { // and
			System.out.println("v1은 40과 50사이에 수입니다.");
		}
		
		if(v2 >= 100 || v2 <= 80) { // or
			System.out.println("v2는 100보다 크거나 80보다 작은 수입니다.");
		}
		

	}

}
