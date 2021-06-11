package backjunTest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int n = Integer.parseInt(br.readLine());
		int[] aa = new int[9];
		
	
		int max=0;
		int index =0;
		
		for (int i =0; i<9; i++) {
			aa[i] = Integer.parseInt(br.readLine());
			if(aa[i] > max) {
				max = aa[i];
				index = i+1;
			}
			
		}
		
		System.out.println(max);
		System.out.println(index);
		
	//	br.close();
		
	}
}
