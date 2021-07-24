package local_variable_global_variable;

public class GlobalVariable {
	
	static int Global2 = 4;
	
	
	public static void main(String[] args) {
	
		System.out.println("Global : " + Global2); // 4
	
		for (int i = 0 ; i < 4 ; i++) {
			System.out.println("Global : " + Global2); // 4
		}
	}

}
