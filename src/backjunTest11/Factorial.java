package backjunTest11;

import java.util.Scanner;

public class Factorial {
	
	public static int factory(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * factory(num-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = Factorial.factory(N);
		
		System.out.println(result);
	}
}
