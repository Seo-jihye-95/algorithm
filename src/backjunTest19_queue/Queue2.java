package backjunTest19_queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Queue <T>{
	// 이런 식으로 class 안에 class로 생성해도 되고 같은 프로젝트 안에 java 파일을 만들어도됨
	// 노드 생성
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	// 멤버 변수
	private Node<T> front;
	private Node<T> rear;
	private int size = 0;
	
	// 함수생성
	// 맨 뒤에 값 추가
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		
		if(rear != null) {
			rear.next = t;
		}
		
		rear = t;
		size ++;
		
		if(front == null) {
			front = rear;
		}
		
	}
		
	// 값이 비어 있는지 확인
	public int isEmpty() {
		if (front == null) {
			// 비어있을때
			return 1;
		} else {
			// 비어 있지않을때
			return 0;
		}
	}
	
	// front 값 출력
	public int front() {
		if(front == null) {
			return -1;
		} 
		return (int)front.data;
	}
	
	// 사이즈 출력
	public int size() {
		if(isEmpty() == 1) {
			return 0;
		} else {
			return size; 
		}
	}
	
	// rear 값 출력
	public int back() {
		if(isEmpty() == 1) {
			return -1;
		} else {
			return (int) rear.data;
		}
	}
	
	
	// 맨 앞에 값 제거
	public int pop() {
		if(front == null) {
			return -1;
		}
		
		T data = front.data;
		front = front.next;
		size--;
		
		if(front == null) {
			rear = null;
		}
		
		return (int) data;
	}
	
	
	
	
}

// 직접 구현한 queue
public class Queue2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new Queue<Integer>();
		int cnt = 0;
		
		while(cnt < N) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String k= st.nextToken();
			if (k.equals("push")) {
				int push_num = Integer.parseInt(st.nextToken());
				q.push(push_num);	
			} else if(k.equals("pop")) {
				bw.write(q.pop()+"\n");
			} else if(k.equals("size")) {
				bw.write(q.size()+"\n");
			} else if(k.equals("front")) {
				bw.write(q.front()+"\n");
			} else if(k.equals("back")) {
				bw.write(q.back()+"\n");
			} else if(k.equals("empty")) {
				bw.write(q.isEmpty()+"\n");
			}
			cnt++;
		}
			bw.flush();
			bw.close();
		
	}
}
