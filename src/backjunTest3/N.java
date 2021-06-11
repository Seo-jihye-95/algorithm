package backjunTest3;

import java.util.Scanner;

public class N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 =0;
		
		for(int i =0; i<num; i++) {
			num2 += 1;
			System.out.println(num2);
		}
	}
}
