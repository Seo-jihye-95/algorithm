package baeckJoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 퀵 정렬
public class NumSort_2750_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int cnt = Integer.parseInt(br.readLine());
		int arr[] = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}	
		
		quickSort(arr, 0, arr.length-1);
	
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void quickSort(int[] data, int start, int end) {
		if(start >= end) return;
		
		int pivot = start;
		int left = pivot+1;
		int right = end;
		int temp;
		
		
		while(left<=right) {
			while(data[left] <= data[pivot] && left < end) {
				left++;
			}
			
			while(data[right] >= data[pivot] && right > start) {
				right--;
			}
			
			if(left < right) {
				temp = data[left];
				data[left] = data[right];
				data[right] = temp;
			} else {
				temp = data[right];
				data[right] = data[pivot];
				data[pivot] = temp;
			}
		}
		
		quickSort(data, start, right-1);
		quickSort(data, right+1, end);
		
	}
}




