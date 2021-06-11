package backjunTest5;

import java.util.Scanner;

public class NumCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a*b*c;
		
		String e = Integer.toString(d);
		System.out.println(e);
		
		
	}
}
