package baeckJoon_DP;

import java.util.Scanner;

public class SugarDelivery_2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k=0;
		int temp;

		int a = N/5;
		int result = 0;
		boolean chk = false;
		
		for(int i=1; i<=a; i++) {
			temp = N-(5*i);
			result += i;
			if(temp%3 == 0) {
				result += temp/3;
				k = result;
				
				chk = true;
			} else {
				temp = 0;
				result  = 0;
			}
			
		}
		
		if(chk==false) {
			if(N%3==0) {
				result = N/3;
			} else {
				result = -1;
			}
		} else {
			result = k;
		}
		
		
		System.out.println(result);

		
	}

}
