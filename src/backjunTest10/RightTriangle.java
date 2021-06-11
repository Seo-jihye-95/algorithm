package backjunTest10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class RightTriangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if (A==0 && B==0 && C==0) {
				break;
			}
			
			int Max = 0;
			int Mid = 0;
			int Min = 0;

			
			if (A > B && A > C) {
				Max = A;
				if (B > C) {
					Mid = B;
					Min = C;
				} else {
					Mid = C;
					Min = B;
				}
			} else if (B > A && B > C) {
				Max = B;
				if (A > C) {
					Mid = A;
					Min = C;
				} else {
					Mid = C;
					Min = A;
				}
			} else if (C > A && C > B) {
				Max = C;
				if (A > B) {
					Mid = A;
					Min = B;
				} else {
					Mid = B;
					Min = A;
				}
			}

			
			if ((int)Math.pow(Max, 2)==((int)Math.pow(Mid, 2)+(int)Math.pow(Min, 2)) ) {
				bw.write("right"+ "\n");
			} else {
				bw.write("wrong"+ "\n");
			}
		
		}
		
		
		bw.flush();
		bw.close();
		
		
		
		
		
		
	}
}
