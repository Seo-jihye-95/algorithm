package baeckJoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//1시50분에 시작 ~ 3시10분에 끝
// 해결실패,,,
public class KeyLogger_5397 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
	
		// 최종 출력할 문자 저장하기	
		StringBuilder sb = new StringBuilder();
		// 배열만들어주기
		String[] array;
		
		for(int cnt=0; cnt<testCase; cnt++) {
			
			String word = br.readLine();
			array = new String[word.length()];
			// 인덱스 계산
			int index =0;
			// 잠깐 값 담아둘 곳
			Stack<Character> st = new Stack<>();
			// 반복문 안에서 값 담기
			char temp;
			
			for(int i=0; i<word.length(); i++) {
				temp = word.charAt(i);
				
				if(temp == '<') {
					if(index != 0) {
						index -= 1;
						if(array[index] != null) {
							if(array[index] != ">" || array[index]!= "<" || array[index] != "-") {
								st.push(array[index].charAt(0));
							}
						}
					}
				} else if(temp == '>') {
					if(array[index+1] != null) {
						index += 1;
					}
				} else if(temp == '-') {
					if(index != 0) {
						index -= 1;
					}
					array[index] = null;
					if(!st.isEmpty()) {
						st.pop();
					}
				} else {
					array[index] = String.valueOf(temp);
					index += 1;
					for(int k=0; k<=st.size(); k++) {
						if(!st.isEmpty()) {
							array[index] = String.valueOf(st.pop());
							index += 1;
						}
					}
				}
			}
				for(int z=0; z<array.length; z++) {
					if(array[z] != null) {
						sb.append(array[z]);
					}
				}
				sb.append("\n");
		}
		

		 System.out.print(sb);
		
	}
}

