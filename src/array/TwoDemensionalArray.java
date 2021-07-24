package array;

public class TwoDemensionalArray {

	public static void main(String[] args) {
		
		int [][] arr = new int [2][3];
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length; j++) {
				System.out.println("arr["+i+"]["+j+"] " + arr[i][j]);
			}
		}
		/*
		    arr[0][0] 0
			arr[0][1] 0
			arr[0][2] 0
			arr[1][0] 0
			arr[1][1] 0
			arr[1][2] 0
		 */

	}

}
