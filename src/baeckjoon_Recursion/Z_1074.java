package baeckjoon_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z_1074 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());	// 배열 크기
		int r = Integer.parseInt(st.nextToken());	// 행
		int c = Integer.parseInt(st.nextToken());	// 열
		
		System.out.println(Z(N,r,c));
		
	}

	
//	3이 들어왔을때 2의제곱 => 4개씩 묶임
//			
//			0행~3행까지
//			0열~3열까지 한 묶음	=> 0~15
//			
//			0행~3행
//			4열~7열까지 한 묶음	=> 16~31
//
//			4행~7행
//			0열~3열까지 한 묶음	=>32~47
//			
//			4행~7행
//			4열~7열까지 한 묶음	=>48~63
	
	public static int Z(int N, int r, int c) {
		int han = (int) Math.pow(2, N);
		int arr[][] = new int[han][han];
		int index=0;
		int k =0; 	// 행
		int z =0;	// 열

//		N이 3임	=> 2의 3승은 8 / 8
//		6행 2열 값 찾기
//		그러면 일단 2의 N-1의 제곱으로 나누기 2의2제곱 => 4
//		4개씩 자름
//		6/4  몫은 1 나머지는 2	몫*2*2의3승(8) = 16까지 채워짐// 행
//		2/4  나머지는 2			// 열
		
		if(N==1) {
			for(int i=0; i<han; i++) {
				for(int j=0; j<han; i++) {
					arr[i][j] = index;
					index += 1;
				}
			}
			return arr[r][c];
		} 
		
		return Z(N-1,k,z);
		
	}
}
