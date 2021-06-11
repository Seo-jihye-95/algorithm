package backjunTest10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SquareEscape {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int aa[] = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())
				,Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		
		int bb[] = {(aa[3] - aa[1]), (aa[2] - aa[0]),aa[1], aa[0]};


		int temp = bb[0];
		for (int i =0; i <4; i++) {
			if ( temp > bb[i]) {
				temp = bb[i];
			}
		}
		
		
		
		System.out.println(temp);
	}
}
