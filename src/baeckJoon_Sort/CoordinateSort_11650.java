package baeckJoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CoordinateSort_11650 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
     
        int cnt = Integer.parseInt(br.readLine());
        Integer arr[][] = new Integer[cnt][2];
        
        for(int i=0; i<cnt; i++) {
    		st = new StringTokenizer(br.readLine()," ");
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		arr[i][0] = x;
    		arr[i][1] = y;
        }
  
//        Arrays.sort(arr,new Comparator<Integer[]>() {
//        	@Override
//        	public int compare(Integer[] o1, Integer[] o2) {
//        		int a = Integer.compare(o1[0], o2[0]);
//        		
//        		if(a == 0) {
//        			return Integer.compare(o1[1], o2[1]);
//        		}
//        		
//        		return a;
//        	}
//		});
        
        Arrays.sort(arr, (e1,e2) -> {
        	if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
        });
        
	
        for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
        }
	
	
	}

}
