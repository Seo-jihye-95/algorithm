package backjunTest18_stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BalancedWorld_4949 {

	public static String solve(String s) {
		
		Stack<Character> st = new Stack();
		
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(' || c == '[') {
				st.push(c);

			} else if (c == ')') {
				if(st.empty() || st.peek() != '(') {
					return "no";
				
				} else {
					st.pop();
				}
				
			} else if (c == ']') {
				if(st.empty() || st.peek() != '[') {
					return "no";
				
				} else {
					st.pop();
				}
			
			}
		}
		
			if(st.empty()) {
				return "yes";
			} else {
				return "no";
			}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BalancedWorld_4949 bd = new BalancedWorld_4949();

		String s;
		
		while(true) {
			
			s = br.readLine();
			
			if(s.equals(".")) {
				break;
			}
			
			bw.write(bd.solve(s) + "\n");
		}
		
		bw.flush();
		bw.close();
		

	} 
	

}
