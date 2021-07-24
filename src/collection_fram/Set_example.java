package collection_fram;

import java.util.*;

public class Set_example {

	public static void main(String[] args) {
		
		// 저장 순서가 유지되지 않으며 객체를 중복해서 저장할 수 없다.
		// 인덱스를 매개값을 갖는 메소드가 없다.
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC"); // 값 추가
		
		System.out.println(set.size()); // 객체 수
		
		Iterator<String> iterator = set.iterator(); // <String> 을 받는 반복자 생성
		while(iterator.hasNext()) { // hasNext() 가져올 객체값이 있으면 True (0번인 JAVA있으니 True)
			String element = iterator.next(); // 컬렉션에서 하나의 객체를 가져옴 (0번을 가르킨 것을 가져옴)
			System.out.println("\t" + element);
		}
		
		
		set.remove("JDBC");
		

		
		iterator = set.iterator(); // 위에서 반복자가 끝까지 돌았기 때문에 다시 쓸라면 초기화 시켜야함
		while(iterator.hasNext()) { // hasNext() 가져올 객체값이 있으면 True 
			String element = iterator.next(); // 컬렉션에서 하나의 객체를 가져옴 넣은 순서대로?
			System.out.println("\t" + element);
		}
		
		Set<Board> set2 = new HashSet<Board>();
		
		set2.add(new Board("제목1","내용1","글쓴이1"));
		set2.add(new Board("제목2","내용2","글쓴이2"));

/*
		Scanner Scanf = new Scanner(System.in);
 		for (int i = 0 ; i < 3; i++) {
 			String title = Scanf.nextLine();
 			String inner = Scanf.nextLine();
 			String author =Scanf.nextLine();
 			Board temp = new Board(title,inner,author);
 			set2.add(temp);
 		}
*/

		Iterator<Board> iterator2 = set2.iterator(); // <String> 을 받는 반복자 생성
		while(iterator2.hasNext()) { // hasNext() 가져올 객체값이 있으면 True 
			Board element = iterator2.next(); // 컬렉션에서 하나의 객체를 가져옴 넣은 순서대로?
			System.out.println("\t" + element); // collection_fram.Board@7637f22
			System.out.println(element.subject);
			System.out.println(element.content);
			System.out.println(element.writer);
		}
		
		
		iterator2 = set2.iterator(); // 위에서 반복자가 끝까지 돌았기 때문에 다시 쓸라면 초기화 시켜야함
		while(iterator2.hasNext()) { // hasNext() 가져올 객체값이 있으면 True 
			Board element = iterator2.next(); // 컬렉션에서 하나의 객체를 가져옴 넣은 순서대로?
			System.out.println("\t" + element);
			System.out.println(element.subject);
			System.out.println(element.content);
			System.out.println(element.writer);
		
	}


	}
}

