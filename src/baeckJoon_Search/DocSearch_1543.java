package baeckJoon_Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocSearch_1543 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();	//ababababa
		String B = br.readLine();	//aba 
		
		int ack = 0;
		int bck = B.length();
		int aindex = A.length();	//9
		int bindex = B.length();	//4
		int cnt = 0;
		
		
		while(ack+bindex <= aindex) {
			if((A.substring(ack,bck)).equals(B)) {
				cnt++;
				ack += bindex;
				bck += bindex;
			} else {
				ack += 1;
				bck += 1;
			}
			
		}
		
		System.out.println(cnt);
			
	}
}
