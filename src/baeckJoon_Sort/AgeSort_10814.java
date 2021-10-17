package baeckJoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AgeSort_10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String arr[][] = new String[N][2];
        
        for(int i=0; i<N; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	for(int j=0; j<2; j++) {
        		arr[i][j] = st.nextToken();
        	}
        }
        
        Arrays.sort(arr,new Comparator<String[]>() {
        	@Override
        	public int compare(String[] o1, String[] o2) {
        		// 0번째 인덱스(나이) 기준으로 비교하기
        		return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
        	}
		});
      
      
  
        for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
        }
        

	}
}
