package backjunTest6;

public class SelfNumer {
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i =0; i<10001; i++) {
			int n = notSelf(i);

			if (n < 10001) {
				check[n]= true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	// 셀프넘버 찾는 메서드
	public static int notSelf(int num){
		int sum = num;
		
		while(num != 0) {
			sum = sum + (num % 10);	// 첫째자리수 
			num = num/10; // 10을 나누어 첫 째 자리를 없앤다.
		}
		
		return sum;
	}
	
}

