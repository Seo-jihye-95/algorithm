package backjunTest6;

import java.util.Scanner;


public class intNSum{

	static long sum(int[] a) {
		long ans = 0;
		
		for(int i =0; i< a.length; i++) {
			ans += a[i];
		}
			return ans;
	}
		
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] a = new int[cnt];
		
		for(int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
		}

		System.out.println(sum(a));
		
	}

}