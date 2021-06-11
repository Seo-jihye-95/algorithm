package backjunTest2;

import java.util.Scanner;

public class AlarmClark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M -45 >= 0) {
			M = M - 45;
			System.out.printf("%d %d",H,M);
		} else {
			if(H-1 < 0) {
				H = 24 -1;
			}else {
				H = H-1;
			}
			M = M + 60-45;
			System.out.printf("%d %d",H,M);
		}
	}
}
