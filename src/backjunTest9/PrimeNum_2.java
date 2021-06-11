package backjunTest9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNum_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(br.readLine());	// 자연수 1
		int N = Integer.parseInt(br.readLine());	// 자연수 2
		boolean flag;
		int R = 0;
		int sum = 0;
		
		for(int i = M; i<=N; i++) {
			flag = true;

			for (int j =2; j<=(int)Math.sqrt(i); j++) {
				if (i % j == 0) {	//소수가 아님
					flag = false;	
					break;
				}
			}
			
			if (flag == true || i ==2 || i ==3) {
				if(i == 1) {
					sum = 0;
				} else {
					sum += i;
					sb.append(i+" ");
				}	
			}
		
		}
		
		//Stringbuilder로 만든것을 String으로 변환 후 자른다.
		String aa[] = sb.toString().split(" ");
		
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(aa[0]);
		}
		
	}

}
