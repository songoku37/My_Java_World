package collection_fram;

import java.util.*;

public class Vector_example {

	public static void main(String[] args) {
		
		// ArrayList랑 비슷하지만 Vector는 동기화된 메소드로 구성되어
		// 멀티 스레드가 동시에 이 메소드를 실행할 수 없다		
		
		List<Board> list = new Vector<Board>();
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2")); 
		list.add(0,new Board("제목3","내용3","글쓴이3"));
		list.remove(1); // 1번 인덱스 제거
		System.out.println(list.size());
		Board board = list.get(0);
		System.out.println(list.get(0)); // collection_fram.Board@4361bd48
		System.out.println(board.subject); // 제목1
		System.out.println(board.content); // 내용1
		System.out.println(board.writer); // 글쓴이1
		System.out.println(list.get(1).subject);
		
		Scanner Scanf = new Scanner(System.in);
		
 		for (int i = 0 ; i < 3; i++) {
 			String title = Scanf.nextLine();
 			String inner = Scanf.nextLine();
 			String author =Scanf.nextLine();
 			Board temp = new Board(title,inner,author);
 			list.add(temp);
 		}		
	}

}
