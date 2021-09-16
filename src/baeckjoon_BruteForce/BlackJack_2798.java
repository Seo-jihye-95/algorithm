package baeckjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2시 40분에 시작
public class BlackJack_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 카드의 갯수
		int N = Integer.parseInt(st.nextToken());
		// 최댓값
		int M = Integer.parseInt(st.nextToken());
		// N 값이 들어가는 배열
		int[] card = new int[N];

		// 배열에 값 넣기
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum =0;
		int max = 0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					sum = card[i]+card[j]+card[k];
					if(sum <= M) {
						if(max <= sum) {
							max = sum;
						}
					}
				}
			}
		}
		
		if(max != 0 ) {
			System.out.println(max);
		}
		
	}
}
