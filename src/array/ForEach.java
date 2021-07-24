package array;

public class ForEach {

	public static void main(String[] args) {

		int[] scores = {95,70,40,50,20};
		
		int sum = 0;
		int count = 0;
		
		for (int score : scores) { // 배열 전체를 받는다
			sum += score;
			count ++;
		}
		System.out.println(sum);
		System.out.println(count);
		
	}

}
