package backjunTest5;

import java.util.Scanner;

public class Max_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int a= sc.nextInt();
		int[] aa = new int[9];
		
		int max = 0;
		int index = 0;
		
		for(int i =0; i<aa.length; i++) {
			aa[i] = sc.nextInt();
			
			if(max < aa[i]) {
				max = aa[i];
				index= i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index); 
		
	}
}
