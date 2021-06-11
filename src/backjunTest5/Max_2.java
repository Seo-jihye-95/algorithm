package backjunTest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] aa= new int[9];
		
		int max =0;
		int index =0;
		
		for(int i=0; i < aa.length; i++) {
			aa[i] = Integer.parseInt(br.readLine());
			if(aa[i] > max) {
				max = aa[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
		
	}
}
