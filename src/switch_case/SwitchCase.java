package switch_case;

public class SwitchCase {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*7) + 1; // +1이 없으면 0부터 시작함
		
		switch (num) {
			case 1:
				System.out.println("1이 출력 됐습니다");
				break;
			case 2:
				System.out.println("2가 출력 됐습니다");
				break;
			case 3:
				System.out.println("3이 출력 됐습니다");
				break;
			case 4:
				System.out.println("4가 출력 됐습니다");
				break;
			case 5:
				System.out.println("5가 출력 됐습니다");
				break;
			case 6:
				System.out.println("6이 출력 됐습니다");
				break;
			default :
				System.out.println("잘못 출력 됐습니다");
				break;

	}


	}
}
