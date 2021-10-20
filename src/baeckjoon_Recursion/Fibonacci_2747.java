package baeckjoon_Recursion;

import java.util.Scanner;

public class Fibonacci_2747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(fibonacci(N));
	}

	public static int fibonacci(int N) {
		
		if(N == 1) return 1;
		
		int a=0;
		int b=1;
		int result=0;
		for(int i=2 ; i<=N ; i++){
			result = a+b;
			a=b;
			b=result;
		}
		
		return result;
	}
	
}
