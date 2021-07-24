package collection_fram;

import java.util.*;

public class HashMap_example2 {

	public static void main(String[] args) {

		Map<Integer,Board> map = new HashMap<Integer,Board>();
		
		Board temp = new Board("Title","Content","author");
		/*
		 	String Title = Scanf.nextLine();
		 	String Content = Scanf.nextLine();
		 	String author = Scanf.nextLine();
		 	temp (Title,Content,author);
		 	map.put(1,temp);
		*/
		map.put(1,temp);
		
		Map<Integer,String[]> map2 = new HashMap<Integer,String[]>();
		String[] strArr_temp = new String[]{"ab","bc","de"}; 
		map2.put(1,strArr_temp);
		Scanner Scanf = new Scanner(System.in);  
		
		
		for (int i = 0 ; i < 2 ; i ++) {
			String tempTitle = Scanf.nextLine();
			String tempContent = Scanf.nextLine();
			String tempAuthor = Scanf.nextLine();
			Board tempBoard = new Board(tempTitle,tempContent,tempAuthor);
			map.put(i,tempBoard);
		}
		
		String[][] strArr_temp2 = new String[][] {{"abc","bc"},{"abcb"}}; // 방식1 

		
//		String[][] strArr_temp2 = new String[][] {{"abc","de"},{"we"}};
		
		List<String[]> arr = new ArrayList<String[]>();
		
		for (int i = 0 ; i < 2 ; i++) {
			String tempTitle = Scanf.nextLine();
			String tempContent = Scanf.nextLine();
			String tempAuthor = Scanf.nextLine();
			String[] strArr_temp3 = new String[]{tempTitle,tempContent,tempAuthor};
			arr.add(i,strArr_temp3);
		}
		
		// for문으로 횟수만큼 돌려도 괜찮다
		
		map2.put(1,strArr_temp);
	}

}
