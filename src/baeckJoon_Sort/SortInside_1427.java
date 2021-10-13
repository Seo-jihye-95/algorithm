package baeckJoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortInside_1427 {
	 public static void main(String[] args) throws NumberFormatException, IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int num = Integer.parseInt(br.readLine());
	        int length =(int)(Math.log10(num)+1);	// 자리수
	        int arr[] = new int[length];
	        int cnt = 0;
	        
	        while(length --> 0) {
	        	 arr[cnt] = num%10;
	        	 num /= 10;
	        	 cnt++;
	        }
	        
	        Arrays.sort(arr);
	        
	        for(int i=arr.length-1; i>=0; i--)
	        System.out.print(arr[i]);
	 }
}
