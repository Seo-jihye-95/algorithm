package backjunTest5;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SadAvg_Test {
	// 평균은 넘겠지 ~
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());	// 테스트 케이스 수
		double[] percent = new double[testcase];
		
		for(int i =0; i<testcase; i++) {
			double sum =0; 
			double avg =0;
			int index =0;
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int StuCnt = Integer.parseInt(st.nextToken());
			int[] StuTotalScore = new int[StuCnt];
			
			for(int j =0; j<StuCnt; j++) {
				int score = Integer.parseInt(st.nextToken());
				StuTotalScore[j] = score;
				sum += StuTotalScore[j];
			}
			
			avg = sum/StuCnt;	// 평균구하기

			
			for(int j =0; j<StuCnt; j++) {
				if(StuTotalScore[j] > avg) {
					index ++;
				}
			}
			percent[i] = ((double)index/(double)StuCnt)*100;
		}
		
		for(int i =0; i<testcase; i++) {
			System.out.println(String.format("%.3f", percent[i])+"%");
		}
		
		
		
	}
}
