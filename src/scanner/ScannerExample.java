package scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner Scanf = new Scanner (System.in); // 한번만 선언해서 쓰면 된다.
		float num2 ;
		int num;
		String str;
		
		do {
			System.out.println(">");
			num2 = Scanf.nextFloat(); // float형 입력하기
			System.out.println(num2);
		}while(num2 != 1.5);
		
		do {
			System.out.println(">");
			num = Scanf.nextInt(); // int형 입력하기
			System.out.println(num);
		}while(num != 0);
		
		do {
			System.out.println(">");
			str = Scanf.nextLine(); // 문자열 입력하기
			
		}while(!str.equals("q"));
		
		System.out.println("시스템을 종료합니다");

	}

}
