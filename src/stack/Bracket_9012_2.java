package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;


public class Bracket_9012_2 {
	public static String solve(String s){
		
		ArrayList<Character> stack = new ArrayList<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if( c == '(') {
				stack.add('(');
			} else {
				if(stack.isEmpty()) {
					return "NO";
				} else {
					stack.remove(stack.size() -1);
				}
			}
		}
				
		if(stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		Bracket_9012_2 bs = new Bracket_9012_2();
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write(bs.solve(st.nextToken())+"\n");
		}
		
			bw.flush();
			bw.close();
		

	}
}

