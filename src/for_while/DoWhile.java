package for_while;

import java.util.*;

public class DoWhile {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while (i <= 100);
		System.out.println(sum);

	}

}
