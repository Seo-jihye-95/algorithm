package backjunTest3;

import java.util.Scanner;

public class Star_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		String star ="*";
		
		for(int i =0 ; i < cnt; i++) {
			System.out.println(star);
			star += "*";
		}
	}
}
