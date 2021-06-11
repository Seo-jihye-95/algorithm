package backjunTest8;

import java.util.Scanner;

public class BreakevenPoint {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long Gojung = sc.nextInt();
		long ByunDong = sc.nextInt();
		long Sellprice = sc.nextInt();	
		

		if(Sellprice <= ByunDong) {
			System.out.println(-1);
		} else {
			System.out.println(Gojung/(Sellprice-ByunDong)+1);
		}
	}
}
