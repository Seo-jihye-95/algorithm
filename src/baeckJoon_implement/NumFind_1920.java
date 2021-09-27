package baeckJoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 추천시간 20분 > 최대 40분 (10시50분 ~ 11시30분)
// 시간초과됨
public class NumFind_1920 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			Arrays.sort(A);
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] B = new int[M];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			B[i] = Integer.parseInt(st1.nextToken());
		}
		
		for(int j=0; j<M; j++) {
			for(int i=0; i<N; i++) {
				if(B[j] == A[i]) {
					B[j] = 1;
				}
			}
		}
		
		for(int i=0; i<M; i++) {
			if(B[i] != 1) {
				B[i] = 0;
			}
			System.out.println(B[i]);
		}
		

		
	}
}
