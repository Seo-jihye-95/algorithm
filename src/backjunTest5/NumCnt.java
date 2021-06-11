package backjunTest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumCnt {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int	A= Integer.parseInt(br.readLine());
		int	B= Integer.parseInt(br.readLine());
		int	C= Integer.parseInt(br.readLine());

		String carti = Integer.toString(A*B*C);
		int x = carti.length();
 
		String[] array1 = new String[x];		
		array1 = carti.split("");
		
		
		int array2[] = new int[10];

		for(int y = 0; y <10; y++) {
			int cnt =0;
			for (int i =0; i< x; i++) {
				if(Integer.parseInt(array1[i]) == y) {
					cnt += 1;
					array2[y] = cnt;
				}
			}
				cnt =0;
		}
		
		for (int i =0; i< 10; i++) {
			System.out.println(array2[i]);
		}

	
	}
}
