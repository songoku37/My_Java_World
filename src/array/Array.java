package array;

public class Array {

	public static void main(String[] args) {
		
		// ---------------------------- 방법 1 --------------------------
		
		int[] score = { 90 , 80 , 70 };
		
		// score[3]= 100; // 에러
		
		System.out.println("score[0]" + score[0]); // 90
		System.out.println("score[1]" + score[1]); // 80
		System.out.println("score[2]" + score[2]); // 70
		// System.out.println("score[3]" + score[3]); // 100
		
		
		int sum = 0;
		for (int i = 0 ; i < 3 ; i++)
		{
			sum = sum + score[i];
		}
		System.out.println(sum); //  240
		
		double avg = (double)sum / 3;
		System.out.println(avg); // 80.0

		// ---------------------------- 방법 2 ----------------------------
		
		int[] arr = new int[3];
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr[" + i + "]" + " = "+arr[i]); // 0 0 0
		}
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for (int i = 0; i < arr.length ; i++) {
			System.out.println("arr[" + i + "]"+ " = "+arr[i]); // 10 20 30
		}

	}

}
