package collection_fram;

import java.util.*;

public class HashMap_example {

	public static void main(String[] args) {
		
		// 키와 값은 모두 객체이다 키는 중복 저장이 안 되지만 값은 중복저장이 가능하다
		Scanner Scanf = new Scanner(System.in);
		

		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("신용권",85);
		map.put("홍길동",90); // 추가

/*
 		for (int i = 0 ; i < 3; i++) {
 			String name = Scanf.nextLine();
 			int number = Scanf.nextInt();
 			map.put(name, number);
 		}
*/

		
		System.out.println(map.size()); // 갯수
		System.out.println(map.get("홍길동")); // 키로 값을 검색
		
		Set<String> keySet = map.keySet(); // ketSet() : 키값을 set으로 얻음
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) { // hasNext의 경우 참 거짓만 반환
			String key = keyIterator.next(); // next의 경우 값을 가져옴
			Integer value = map.get(key);
			System.out.println("\t" + key + " " + value);
		}
		

		String search = Scanf.nextLine(); // 키를 입력받아서 그에 해당하는 값을 출력
 		System.out.println(map.get(search)); 

		
		map.remove("홍길동"); // 무조건 키값으로 제거해야함
		
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet(); 
		// Set<Ma...>을 담을 수 있는 객체에 entrySet() : 키와 값 쌍으로 구성된 Map.Entry를 Set에 담아 리턴
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator(); // 같은 형태 객체에 반복자 생성
		
		while(entryIterator.hasNext()) {
			Map.Entry<String,Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = map.get(key);
			System.out.println("\t" + key + " " + value);
		}
		
		
	}

}
