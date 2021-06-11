package backjunTest8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMHotel {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		String array[] = new String[testcase];
		int row = 0;
		int roomnum = 0;
		
		for(int i = 0; i<testcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			row = N%H;
			roomnum = N/H +1;
			
			if (row == 0) {
				row = H;
				roomnum -= 1;
			}
			
			if(roomnum <10) {
				array[i] = Integer.toString(row)+"0"+Integer.toString(roomnum);
			} else {
				array[i] = Integer.toString(row)+Integer.toString(roomnum);
			}
		}
		
		for(int i = 0; i<testcase; i++) {
			System.out.println(Integer.parseInt(array[i]));
		}
		
	
				
	}
}
