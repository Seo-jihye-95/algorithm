package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class stackArray2{
	
	private int stackSize;
	private int stackArr[];
	private int top;
	
	public stackArray2(int stackSize) {
		this.top = -1;
		this.stackSize = stackSize;
		this.stackArr = new int[stackSize];
	}
	
	
	public void push(int push_num) {
		stackArr[++top] = push_num; 
	}
	
	public int pop() {
		return stackArr[top--];
	}
	

	public int size() {
		if (top == -1) {
			return 0;
		} else {
			return top+1;	// top이 0일 때 원소가 1개이기 때문에 +1 후 리턴
		}
	}
	
	public int top() {
		return stackArr[top];
	}
	
}

public class zero {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		
		stackArray2 sa = new stackArray2(k);
		
		int cnt =0;
		
		while(cnt < k) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			if(num != 0) {
				sa.push(num);
			} else if (num ==0) {
				sa.pop();
			}
			
			cnt++;
		}
		
		int a = sa.size();
		
		int num =0;
		
		for(int i=0; i<a; i++) {
			num += Integer.parseInt((String.valueOf(sa.top())));
			sa.pop();
		}
		
		System.out.println(num);
		
	}
}
