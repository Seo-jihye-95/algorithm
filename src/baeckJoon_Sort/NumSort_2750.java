package baeckJoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumSort_2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		int arr[] = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 기본 정렬 라이브러리 사용
		//Arrays.sort(arr);
		
		for(int i=0; i<cnt; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			
			sb.append(arr[i] + "\n");
		}
		
		System.out.println(sb.toString());
	}
}
