package backjunTest7;

import java.util.Scanner;

public class NumSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		String N = sc.next();
		int sum =0;
		
		
		for(int i =0; i<K; i++) {

//			sum += N.charAt(i) - '0';
			sum += Character.getNumericValue(N.charAt(i));

		}

		System.out.println(sum);

	}

}
