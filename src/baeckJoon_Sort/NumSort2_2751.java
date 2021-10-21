package baeckJoon_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumSort2_2751 {
	// 54번째줄에 있는것 처럼 매번 sorted를 생성하면  O(N^2) 시간이 걸림. 그래서 미리 할당
	static int[] sorted;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] mergeTest= new int[N];
		sorted = new int[N];
		
		for(int i=0; i<N; i++) {
			mergeTest[i] = Integer.parseInt(br.readLine());
		}
	
		mergeSort(mergeTest, 0, mergeTest.length-1);
		
		for(int i : mergeTest) {
			result.append(i+"\n");
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
	
	public static void mergeSort(int arr[], int l, int r) {
		if( l< r ) {	//더 쪼갤 수 있는지 확인하기(index임)
			
			int m = (l+r)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
		
			merge(arr,l,m,r);
		}
	}
	
	public static void merge(int[] arr, int l, int m, int r) {
		int left = l;
		int right = m+1;
		int k= l;
		
		//int[] sorted = new int[arr.length];
		
		while((left<= m) && (right<=r)) {
			if(arr[left] < arr[right]) {
				sorted[k] = arr[left];
				left++;
			} else {
				sorted[k] = arr[right];
				right++;
			}
			k++;
		}
		
		while(left <= m) {
			sorted[k] = arr[left];
			k++;
			left++;
		}
		
		while(right <= r) {
			sorted[k] = arr[right];
			k++;
			right++;
		}
		
		for(int t=l; t<=r; t++) {
			arr[t] = sorted[t];
		}
	}
}
