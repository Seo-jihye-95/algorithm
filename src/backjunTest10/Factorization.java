package backjunTest10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Factorization {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		while (true) {
			int a = (int)Math.sqrt(N);
			
			for (int i =2; i<=a; i++) {
				if( N % i == 0) {
					N = N/i;
					if(N % i != 0) {
						break;
					}
				}
				
			}
			bw.write(a);

		}
		
//		bw.flush();
//		bw.close();
		
	}
}
