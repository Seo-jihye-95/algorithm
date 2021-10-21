package baeckJoon_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 병합정렬사용
public class KNum_11004 {
	static int[] arr;
	static int[] sorted;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		sorted = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(arr,0,N-1);
		
		System.out.println(arr[K-1]);
		
	}
	
	public static void mergeSort(int[] arr, int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			
			merge(arr,l,m,r);
		}
	}
	
	public static void merge(int[] arr, int l, int m, int r) {
		int left = l;
		int right = m+1;
		int index = l;
		
		while((left<=m) && (right<=r)) {
			if(arr[left] <= arr[right]) {
				sorted[index] = arr[left];
				left++;
			} else {
				sorted[index] = arr[right];
				right++;
			}
			index++;
		}
		
		while((left<=m)) {
			sorted[index] = arr[left];
			left++;
			index++;
		}
		
		while((right<=r)) {
			sorted[index] = arr[right];
			right++;
			index++;
		}
		
		for(int i=l; i<=r; i++) {
			arr[i] = sorted[i];
		}
		
	}
	
	
}
