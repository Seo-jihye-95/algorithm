package baeckJoon_DP;

import java.util.Scanner;

public class recursive_call {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println(recursive_call.fibo(num));		
	}
	
	static int fibo(int num) {
		if (num <= 1) {
			return num;
		}	
		return fibo(num-1) + fibo(num-2);
	}
	
}
