package backjunTest1;

import java.util.Scanner;

public class ABpmc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println((int)(Math.floor(((double)A/(double)B))));
			System.out.println((int)((double)A%(double)B));
	
	}
}
