package backjunTest3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastABplus {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcount = Integer.parseInt(br.readLine());
		int[] sum = new int[testcount];
		
		for (int i=0; i<testcount; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			sum[i] = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			bw.write(sum[i]+"\n");
		}
		
			bw.flush();
			bw.close();
		
	}
}
