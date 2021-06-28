package backjunTest19_queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// LinkedList 를 이용하여 생성
public class Queue2_LinkedList {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		LinkedList<Integer> q = new LinkedList<>();
		
		while (cnt < N) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String k= st.nextToken();
			
			if (k.equals("push")) {
				int push_num = Integer.parseInt(st.nextToken());
				// push는 stack에서 사용 queue에서는 add 또는 offer
				q.offer(push_num);	
			} else if(k.equals("pop")) {
				if(q.peek() == null) {
					bw.write(-1+"\n");
				}
				else {
					bw.write(q.peek()+"\n");
					q.poll();
				}
			} else if(k.equals("size")) {
				bw.write(q.size()+"\n");
			} else if(k.equals("front")) {
				Integer ite = q.peek();
				// peek() 은 큐에 꺼낼 요소가 없을 경우 null 을 반환한다.
				if(ite == null) {
					bw.write(-1+"\n");	
				} 
				else {
					bw.write(q.peek()+"\n");
				}
			} else if(k.equals("back")) {
				if(q.isEmpty() == true) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write(q.peekLast()+"\n");	
				}
			} else if(k.equals("empty")) {
				if(q.isEmpty() == false) {	// 비어있지 않을때
					bw.write(0+"\n");	
				}
				else {	// 비어있을때
					bw.write(1+"\n");	
				}
			}
			cnt++;
		}
		
		bw.flush();
		bw.close();
		
	}
}
