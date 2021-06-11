package backjunTest5;

import java.util.Scanner;

public class ScoreAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		double[] a = new double[count];
		
		double max = 0;
		double temp = 0;
		
		for(int i=0; i<count; i++) {
			a[i] = sc.nextInt();
		
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		for(int i=0; i<count; i++) {
			temp += ((a[i]/max)*100);
		}
		
		System.out.println(temp/count);
	}
}
