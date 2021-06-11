package backjunTest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OXquiz {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a= Integer.parseInt(st.nextToken());
		
		int score[] = new int[a];
		int i =0;
		for(i=0; i<score.length; i++) {
			int temp = 0;
			int TotalScore =0;
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++ ) {
				if(str.charAt(j)=='O'){
					temp+=1;
					TotalScore += temp;
				}else {
					TotalScore += 0;
					temp = 0;
				}
			}
			score[i] = TotalScore;
		}// 전체 for문의 끝
		
		
		for(i =0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
	}
}
