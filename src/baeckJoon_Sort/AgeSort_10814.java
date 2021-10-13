package baeckJoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class AgeSort_10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        // 이름이 key , 나이가 value
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(); 

        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	int age = Integer.parseInt(st.nextToken());
        	String name = st.nextToken();
        	
        	map.put(name, age);
        }
        
        
        map.forEach((key, value) -> { 
        	System.out.println("Key:" + key + ", Value:" + value); 
        });

//        
//        for(int i=0; i<t; i++) {
//        	for(int j=i+1; j<t; j++) {
//        		map.get(name);
//      
//        	}
//        }
//        
        
        

	}
}
