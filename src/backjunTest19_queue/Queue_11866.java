package backjunTest19_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 참고 : https://st-lab.tistory.com/197
public class Queue_11866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
	LinkedList<Integer> q = new LinkedList<Integer>();
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(st.nextToken());
	int K = Integer.parseInt(st.nextToken());
	
	
	for(int i=1; i<=N; i++) {
		q.add(i);
	}
	
	sb.append("<");
	
	while(q.size() > 1){
		for(int i=0; i<K-1; i++) {
			q.offer(q.poll());
		}
		sb.append(q.poll()+", ");
	}
	
	sb.append(q.poll()).append(">");
	System.out.println(sb);
	
	
	}
}
