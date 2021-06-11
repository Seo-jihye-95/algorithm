package backjunTest7;

import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String K = sc.next();
		
		char ch = K.charAt(0);
		System.out.println((int)ch);
	}
}
