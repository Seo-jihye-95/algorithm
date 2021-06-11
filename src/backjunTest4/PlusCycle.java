package backjunTest4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PlusCycle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int input = Integer.parseInt(br.readLine());
		int N = input;
		int cnt = 0;
		
		while(true) {
			int a = input / 10;	// 십의 자리수	2
			int b = input % 10;	// 일의 자리수	6
			int c = (a+b)%10;	// 새로운 수의 일의 자리 수	8
			int d = (b*10)+c;	// 새로운수
			
			cnt++;
			
			if(N == d) {
				break;
			}
			
			input = d;
		}
		
		System.out.println(cnt);
		
		
	}
}
