package backjunTest18_stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack_sequence_1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());	// 8까지 입력
		int start = 0;
		
		while(n > 0) {
			int value = Integer.parseInt(br.readLine()); // 4를 입력
			
			if(value > start) {
				for(int i = start+1; i <= value; i++) {	
					st.push(i);
					sb.append("+").append("\n");	
				}
				start = value;
			} else if (st.peek() != value) {
				System.out.println("NO"); 
				return;
			}
			
			st.pop();
			sb.append("-").append("\n");
			n--;
		}
			System.out.println(sb);
	}

}
