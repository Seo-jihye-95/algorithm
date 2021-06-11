package backjunTest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SadAvg {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		double[] percent = new double[testcase];
		
		for(int i =0; i<testcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int SdtCnt = Integer.parseInt(st.nextToken());
			int[] SdtAvg= new int[SdtCnt];
		
			double sum = 0;
			double avg = 0;
			// 성적 입력부분
			for(int j=0; j<SdtCnt; j++) {
				int val = Integer.parseInt(st.nextToken());
				SdtAvg[j] = val;
				sum += val;
			}
				avg = sum/SdtCnt;
			
				int index =0;	
			for(int j=0; j<SdtCnt; j++) {
				if(SdtAvg[j] > avg) {
					index++;
				}
			}
		
			percent[i] = ((double)index/(double)SdtCnt)*100;
		}
		
		
		for(int i =0; i<testcase; i++) {
			System.out.println(String.format("%.3f", percent[i])+"%");
		}

	}
}
