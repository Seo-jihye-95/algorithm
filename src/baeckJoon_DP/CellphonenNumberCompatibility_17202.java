package baeckJoon_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CellphonenNumberCompatibility_17202 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String[] n1 = new String[8];
		String[] n2 = new String[8];
		
		ArrayList<String> n4 = new ArrayList<String>();
		
		n1 = br.readLine().split("");
		n2 = br.readLine().split("");

		int i = 0;
		int j = 0;
		
		while(i<n1.length) {
			while(j<16) {
				n4.add(j, n1[i]);
					j++;
				n4.add(j, n2[i]);
					j++;
					i++;
			}
		}
	
		int m = 15;
		while (m >= 2) {
			int sum;
			for(int k=0; k<n4.size()-1; k++) {
				sum = Integer.parseInt(n4.get(k)) + Integer.parseInt(n4.get(k+1));
				if(sum>=10) {
					sum = sum%10;
				}
				n4.set(k, String.valueOf(sum));
			}
			n4.remove(n4.size()-1);
			m--;
		}
		
		System.out.println(n4.get(0)+n4.get(1));
	}
}
