package backjunTest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumRmd {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array1[] = new String[10];
		int array2[] = new int[10];
		
		for (int i=0; i<10; i++) {
			array1[i] = br.readLine();
			array2[i] = Integer.parseInt(array1[i]) % 42;
		}
		
		int cnt = 0;
		int cnt2 =0;
		for (int i=0; i<10; i++) {
			for (int y=i+1; y<10; y++) {
				if(array2[i] == array2[y]) {
					cnt += 1;
				}
			}
			if(cnt > 0) {
				cnt2 += 1;
			}
			cnt =0;
		}
		
		System.out.println(10 - cnt2);
		
	}
}
