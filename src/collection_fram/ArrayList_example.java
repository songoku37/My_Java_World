package collection_fram;

import java.util.*;

public class ArrayList_example {

	public static void main(String[] args) {
		// List 인터페이스의 클래스
		// 객체 삽입하거나 제거되었을 때 하나씩 밀려나는 특징 LinkedList에 비해 안 좋음
		// 채우는 순서는 정해져있음 0 부터 ~ 차근차근
		// 제거하거나 추가하는 경우 인덱스가 하나씩 밀린다
		// 그냥 배열하고 다른 점은 크기가 동적으로


		
		List<String> list = new ArrayList<String>(); // (40) 숫자 지정가능
		// List list = new ArrayList(); 일 경우 객체를 다 받지만 형변환 속도문제가 생김
		list.add("홍길동"); //맨 끝에 객체 추가
		list.add(1,"신용권2"); // 지정 인덱스에 삽입
		list.add(1,"신용권"); // 지정 인덱스에 삽입
		list.add(1,"신용권"); // 지정 인덱스에 삽입
		list.add(1,"신용권"); // 지정 인덱스에 삽입
		String str = list.get(1); // 인덱스 1값 반환
		System.out.println(str); // 신용권
		list.size(); // 객체 수
		list.remove(0); // 인덱스로 삭제
		list.remove("신용권"); // 객체명으로 삭제
		System.out.println(list.get(1));
		
		
		List<Board> list2 = new ArrayList<Board>(); 
		list2.add(new Board("제목1","내용1","글쓴이1"));
		list2.add(1,new Board("제목2","내용2","글쓴이2"));
		list2.add(new Board("제목3","내용3","글쓴이3"));
		list2.size(); // 1
		list2.remove(1);
		Board board = list2.get(1); // collection_fram.Board@26f0a63f
		System.out.println(board.subject); // 제목3
		System.out.println(board.content); // 내용3
		System.out.println(board.writer); // 글쓴이3
		
		Scanner Scanf = new Scanner (System.in);

 		for (int i = 0 ; i < 3; i++) {
 			String title = Scanf.nextLine();
 			String inner = Scanf.nextLine();
 			String author =Scanf.nextLine();
 			Board temp = new Board(title,inner,author);
 			list2.add(temp);
 		}

	}

}
