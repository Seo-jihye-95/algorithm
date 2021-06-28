package backjunTest18_stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class Bracket_9012 {
	public static String solve(String s){
		
		Stack<Character> stack = new Stack<>();
		
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			
			} else if (stack.empty()) {
				return "NO";
				
			} else {
				stack.pop();
			}
		}
		
			if(stack.empty()) {
				return "YES";
			} else {
				return "NO";
			}
		
	}

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		Bracket_9012 bs = new Bracket_9012();
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write(bs.solve(st.nextToken())+"\n");
		}
		
			bw.flush();
			bw.close();
		

	}
}

