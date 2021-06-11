package backjunTest6;

import java.util.Scanner;

public class intNSum_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int a[] = new int[cnt];
		for(int i =0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(sum(a));
	}
	
	
	// 메서드 생성
	static long sum(int[] a) {
		long TotalSum = 0;
		
		for(int i=0; i<a.length; i++) {
			TotalSum += a[i];
		}
		return TotalSum;
	}
	
}
