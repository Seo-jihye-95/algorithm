package backjunTest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMin {
	public static void main(String[] args) throws IOException {
		// 시간초과로 쓸수 없음 
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(bf.readLine());	
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			
			String s[]= bf.readLine().split(" ");
			
			// 정렬을 한다음 맨앞이랑 맨뒤의 값만 추출
			for (int k =0; k< s.length; k++) {
				if(Integer.parseInt(s[k]) < -1000000 || Integer.parseInt(s[k]) > 1000000) {
					System.out.println("정수는 -1000000 미만이거나 1000000를 초과 할 수 없습니다."); 
					return;
				} else {
					// 정렬하기
					for(int stand =0; stand< s.length -1; stand++) {
						int lowest = stand;
						for (int j= stand+1; j<s.length; j++) {
							if( Integer.parseInt(s[lowest]) > Integer.parseInt(s[j])) {
								lowest = j;
							}
						}
						String temp = s[stand];
						s[stand] = s[lowest];
						s[lowest] = temp;
					}
					
				} 
			}
			System.out.printf("%d %d",Integer.parseInt(s[0]),Integer.parseInt(s[s.length-1]));
			
		} catch (NumberFormatException e) {
			  System.out.println("Bad String    ");
			  return;
		}
		
	}
}
