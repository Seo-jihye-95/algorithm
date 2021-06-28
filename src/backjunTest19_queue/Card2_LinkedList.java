package backjunTest19_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

// 라이브러리를 이용한 queue
public class Card2_LinkedList {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i<= N; i++) {
			q.offer(i);
		}
		
		while(q.size() > 1) {
			q.poll();	// queue에 첫번째 값을 반환하고 제거
			q.offer(q.poll()); 	// queue에 첫번째 값을 반환한 값을 추가한 후 제거
		}
		
		System.out.println(q.poll());
	}
}
