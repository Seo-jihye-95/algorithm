package baeckJoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이진탐색트리 사용
public class NumFind_1920_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		int M = Integer.parseInt(br.readLine());
		int[] B = new int[M];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			B[i] = Integer.parseInt(st1.nextToken());
		}

		for(int i=0; i<M; i++) {
			
			int startIndex = 0;
			int endIndex = N-1;
			int midIndex = (N-1) / 2;	
			int flag = 0;
			
			while(startIndex <= endIndex) {
				midIndex = (startIndex + endIndex) /2; 
				if(A[midIndex] > B[i]) {
					endIndex = midIndex - 1;
				} else if (A[midIndex] < B[i]) {
					startIndex = midIndex + 1;
				} else { 
//					B[i] = 1;
					flag = 1;
					break;
				}
			}
			
			System.out.println(flag); 
		}
		
//		 for(int i=0; i<M; i++) {
//			 if(B[i] != 1) {
//				 B[i] = 0; 
//			 }
//			 	System.out.println(B[i]); 
//		 }
//		 
		
		
	}
}
