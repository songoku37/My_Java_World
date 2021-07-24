package token;

import java.util.StringTokenizer;

public class ToeknExam {

	public static void main(String[] args) {
	
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		// "/" 기준으로 분리함
		int countTokens = st.countTokens();
		for (int i = 0 ; i < countTokens; i++) {
			String token = st.nextToken(); // 토큰 한개 pop
			System.out.println(token);
		}
		
		System.out.println();

			st = new StringTokenizer(text,"/");
			while(st.hasMoreTokens()) { // 토큰이 남아있는가
				String token = st.nextToken();
				System.out.println(token);
			}
	}
}


