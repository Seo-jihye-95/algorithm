package baeckJoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoordinateSort_11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
     
        int cnt = Integer.parseInt(br.readLine());
        int arr[][] = new int[cnt][2];
        
        for(int i=0; i<cnt; i++) {
    		st = new StringTokenizer(br.readLine()," ");
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		arr[i][0] = x;
    		arr[i][1] = y;
        }
        
        for(int i=0; i<cnt; i++) {
        	for(int j=i+1; j<cnt; j++) {
        		if(arr[i][0] > arr[j][0]) {
        			int temp1 = arr[j][0];
        			int temp2 = arr[j][1];
        			
        			arr[j][0] = arr[i][0];
        			arr[j][1] = arr[i][1];
        			
        			arr[i][0] = temp1;
        			arr[i][1] = temp2;
        		
        		} else if (arr[i][0] == arr[j][0]) {
        			if(arr[i][1] > arr[j][1]) {
        				int temp3 = arr[j][1];
        				arr[j][1] = arr[i][1];
        				arr[i][1] = temp3;
        			}
        		}
        		
        	}
        }
        
        
        for(int i=0; i<cnt; i++) {
        	for(int j=0; j<2; j++) {
        		sb.append(arr[i][j]+" ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
        
        
	}
}
