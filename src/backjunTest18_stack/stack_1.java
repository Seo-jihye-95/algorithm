package backjunTest18_stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class stackArray {
	private int top;
	private int stackSize;
	private int stackArr[];

	public stackArray(int stacksize) {
		this.top = -1;
		this.stackSize = stacksize;
		this.stackArr = new int[stacksize];
	}


	// 스택에 값 넣기
	public void push(int push_num) {
		stackArr[++top] = push_num;
	}

	// 스택에 값 빼기
	public int pop() {
		if (top == -1) {
			return -1;
		} else {
			return stackArr[top--];
		}
	}

	public int size() {
		if (top == -1) {
			return 0;
		} else {
			return top+1;	// top이 0일 때 원소가 1개이기 때문에 +1 후 리턴
		}
	}
	
	// 스택이 비어 있는지 확인
	public int empty() {
		if (top == -1) {
			// 비어있으면 1
			return 1;
		} else {
			// 값이 있으면 0
			return 0;
		}
	}

	// top 추출
	public int top() {
		if (top == -1) {
			return -1;
		} else {
			return stackArr[top];
		}
	}

}

public class stack_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		stackArray st = new stackArray(N);

		int cnt = 0;
		while (cnt < N) {
			StringTokenizer stn = new StringTokenizer(br.readLine(), " ");
			String k = stn.nextToken();
			if (k.equals("push")) {
				int push_num = Integer.parseInt(stn.nextToken());
				st.push(push_num);
			} else if (k.equals("pop")) {
				bw.write(String.valueOf(st.pop())+"\n");
			} else if (k.equals("size")) {
				bw.write(String.valueOf(st.size())+"\n");
			} else if (k.equals("empty")) {
				bw.write(String.valueOf(st.empty())+"\n");
			} else if (k.equals("top")){
				bw.write(String.valueOf(st.top())+"\n");
			}
				cnt++;
		}

		bw.flush();
		bw.close();
	}
}
