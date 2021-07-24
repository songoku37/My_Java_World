package local_variable_global_variable;

public class LocalVariable {

	public static void main(String[] args) {
		
		
		for (int i = 0 ; i < 4 ; i++) {
			int local = 4;
			System.out.println("Local " + local); // 4
		}
		System.out.println("Local " + local); // 에러

	}

}
