package backjunTest8;

import java.util.Scanner;

public class FindFraction {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int search = sc.nextInt();
		
		int group = 1;	// 몇번째 그룹인지 
		int range = 1;	// 범위 
		
		
		// 몇번 째 그룹인지
		while (range < search) {	 // 10
			group ++;
			range +=  group;
		}
		
		// 그 그룹의 몇번째 인지
		int cnt = group; 	// 몇번째인지
		for (int i = range; i >= search; i--) {
			cnt--;
		}
		
		
		// 분수로 나타내기 
		if (group %2 == 0) {	// 그룹 갯수가 짝수일때는
			int y= 1;
			for (y = 1; y< cnt+1; y++) {
				group --;
			}
			System.out.println(y+"/"+group);
		} else {	// 그룹 갯수가 홀수 일때
			int y= 1;
			for (y = 1; y< cnt+1; y++) {
				group --;
			}
			System.out.println(group+"/"+y);
		}

		
	}
}
