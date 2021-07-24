package for_while;

public class For {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100 ; i++) {
			sum = sum + i; // i는 101이 돼서 나옴
		}
		System.out.println(sum);
		
		// ------------- 1 ~ 100 까지 합 ------------------
		
		for (int i = 1 ; i < 10 ; i++) {
			System.out.println("------------"+ i + "단입니다------------");
			for (int j = 1; j < 10; j++)
			{
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		// -------------- 구구단 출력 -------------------------

	}

}
