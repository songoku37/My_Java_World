package collection_fram;

import java.util.*;

public class LinkedList_example {

	public static void main(String[] args) {


		List<String> list = new LinkedList<String>();
		list.add(0,String.valueOf(1));
		list.add(String.valueOf(2)); // toString의 경우 null 문자열 처리 불가
		list.add(String.valueOf(3));
		System.out.println(list);// [1, 2, ,3]
		list.remove(1); // 2 제거 [1 , 3]
		list.add("2"); //  맨 끝에 2 추가 [1, 3 ,2]
		list.add("1"); // [1, 3, 2, 1]
		System.out.println(list); 
		list.remove("1"); // [3, 2, 1] 가장 적은 인덱스에 것 먼저 제거
		System.out.println(list);
		
		
		List<Board> list2 = new LinkedList<Board>(); 
		list2.add(new Board("제목1","내용1","글쓴이1"));
		list2.add(1,new Board("제목2","내용2","글쓴이2"));
		list2.add(new Board("제목3","내용3","글쓴이3"));
		list2.size(); // 1
		list2.remove(1);
		Board board = list2.get(1); // collection_fram.Board@26f0a63f
		System.out.println(board.subject); // 제목3
		System.out.println(board.content); // 내용3
		System.out.println(board.writer); // 글쓴이3
		

		Scanner Scanf = new Scanner(System.in);
 		for (int i = 0 ; i < 3; i++) {
 			String title = Scanf.nextLine();
 			String inner = Scanf.nextLine();
 			String author =Scanf.nextLine();
 			Board temp = new Board(title,inner,author);
 			list2.add(temp);
 		}

	}

}
