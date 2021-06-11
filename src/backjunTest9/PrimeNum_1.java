package backjunTest9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNum_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int N = Integer.parseInt(br.readLine());
	int cnt = 0;
	boolean flag;
	
	
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	
	for (int i = 0; i < N; i++) {
		flag = true;
		int value = Integer.parseInt(st.nextToken());

		for (int j=2; j<=(int)Math.sqrt(value); j++) {
			if(value % j == 0) {	 
				flag = false;
				break;
			} 
		}
		
		if(flag == true ||  value == 2 || value == 3 ) {	// �Ҽ��� �ֵ�
			if(value == 1) {
				cnt+=0;
			} else {
				cnt+=1;
			}
		} else {
			cnt += 0;
		}
		
	}
	
		System.out.println(cnt);
	
	}
}
