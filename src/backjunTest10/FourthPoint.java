package backjunTest10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourthPoint {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a[] = br.readLine().split(" ");
		String b[] = br.readLine().split(" ");
		String c[] = br.readLine().split(" ");
		int x =0;
		int y =0;
		

		if(Integer.parseInt(a[0]) == Integer.parseInt(b[0])) {
			x = Integer.parseInt(c[0]);
		} else if(Integer.parseInt(b[0]) == Integer.parseInt(c[0])) {
			x = Integer.parseInt(a[0]);
		} else if(Integer.parseInt(a[0]) == Integer.parseInt(c[0])) {
			x = Integer.parseInt(b[0]);
		}
		

		if(Integer.parseInt(a[1]) == Integer.parseInt(b[1])) {
			y = Integer.parseInt(c[1]);
		} else if(Integer.parseInt(b[1]) == Integer.parseInt(c[1])) {
			y = Integer.parseInt(a[1]);
		} else if(Integer.parseInt(a[1]) == Integer.parseInt(c[1])) {
			y = Integer.parseInt(b[1]);
		}
		
		System.out.println(x+" "+y);
			
		
	}
}
