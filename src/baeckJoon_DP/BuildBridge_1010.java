package baeckJoon_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuildBridge_1010 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int caseCnt = Integer.parseInt(br.readLine());
		int left =0;
		int right=0;
		int m =0;
		int result = 0;
		int n =0;
		
		for(int i=0; i<caseCnt; i++) {
			st = new StringTokenizer(br.readLine());
			left = Integer.parseInt(st.nextToken());
			right = Integer.parseInt(st.nextToken());
		}
		
		// 0, 1, 2
		for(int i=n; i<left; i++) {
			m = left;
			// 0, 1, 2, 3, 4
			for(int j=0; j<right-m-1; j++) {
				result += 1;
			}
			
			m -= 1;
			n += 1;
		}


	}
}
