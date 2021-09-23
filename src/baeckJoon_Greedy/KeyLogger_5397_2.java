package baeckJoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class KeyLogger_5397_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	// 스택을 2개를 이용해서 문제 풀이
	// 2개의 스택을 이용
	// ABC<<D>E<<F>>--	  ADFC
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		// 최종 출력할 문자 저장하기	
		StringBuilder sb = new StringBuilder();
		
		for(int cnt=0; cnt<testCase; cnt++) {
			String word = br.readLine();
			Stack<Character> right = new Stack<>();
			Stack<Character> left = new Stack<>();
			Stack<Character> st = new Stack<>();
			
			// 반복문 안에서 값 담기
			char temp;
			for(int i=0; i<word.length(); i++) {
				temp = word.charAt(i);
				
				if(temp == '<') {
					if(!left.isEmpty()) {
						right.push(left.pop());
					}
				} else if(temp == '>') {
					if(!right.isEmpty()) {
						left.push(right.pop());
					}
				} else if(temp == '-') {
					if(!left.isEmpty()) {
						left.pop();
					}
				} else {
					left.push(temp);
				}
			}

			int rsize = right.size();
			if(!right.isEmpty()) {
				for(int i=0; i<rsize; i++) {
					left.push(right.pop());
				}
			}
			
			for(int i=left.size(); i>0; i--) {
				st.push(left.pop());
			}
			
			int size=st.size();
			for(int i=0; i<size; i++) {
				sb.append(st.pop());
			}
			sb.append("\n");
	
		}

		 System.out.print(sb);
		
	}
}
