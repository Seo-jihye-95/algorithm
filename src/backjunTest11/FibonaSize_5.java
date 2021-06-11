package backjunTest11;

import java.util.Scanner;

public class FibonaSize_5 {
	public static int fibo(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return fibo(num-2) + fibo(num-1);	
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = FibonaSize_5.fibo(n);
				
		System.out.println(result);
		
	}
}
