package backjunTest8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int A = Integer.parseInt(st.nextToken());	// 올라간 높이
		int B = Integer.parseInt(st.nextToken());	// 떨어진 높이
		int V = Integer.parseInt(st.nextToken());	// 총 높이
		
		
		int day =(V-B)/(A-B);

		
		if (((V-B)%(A-B))!=0) {
			day++;
		}
		
		System.out.println(day);
		
		
		
		
	}
}
