package backjunTest19_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Printer_Queue_1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());	// 테스트 케이스
		
		while(N > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int docuCount = Integer.parseInt(st.nextToken());	// 문서의 갯수
			int docuNumber = Integer.parseInt(st.nextToken());	// 조회를 원하는 문서의 번호
			
			
			LinkedList<int[]> q = new LinkedList<>();	// Queue로 활용 할 연결리스트
			StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
			
			for(int i =0; i<docuCount; i++) {
				// { 초기 위치, 중요도 }
				q.offer(new int[] {i, Integer.parseInt(st2.nextToken())});
			}
			
			int count = 0;
			
			while(!q.isEmpty()) {
				int[] front = q.poll();
				boolean isMax = true;
				
				for(int i =0; i<q.size(); i++) {
					if(front[i] < q.get(i)[1]) {
						q.offer(front);
						for(int j =0; j<i; j++) {
							q.offer(q.poll());
						}
					}
				}
			}
			
			for (int i =0; i<docuNumber; i++) {
				q.add(q.poll());
			}
			
//			sb.append(b + "\n");
			q.clear();
		}
		
		System.out.println(sb);
		
		
	}
}
