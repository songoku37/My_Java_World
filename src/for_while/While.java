package for_while;

public class While {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while (i <= 100) { // 참이면 실행
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
