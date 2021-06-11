package backjunTest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABplus3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcount = Integer.parseInt(br.readLine());
		int[] sum = new int[testcount];
		
		for (int i =0; i<testcount; i++) {
			String str = br.readLine();
			String[] strsp = str.split(" ");
			for(int j=0; j<strsp.length; j++) {
				sum[i] += Integer.parseInt(strsp[j]);
			}
			
		}
		
		for (int i =0; i<testcount; i++) {
			System.out.println(sum[i]);
		}
		
	}
}
