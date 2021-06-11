package backjunTest2;

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		
		if(90 <= A && A <=100) {
			System.out.println("A");
		} else if(80 <= A && A < 90) {
			System.out.println("B");
		} else if(70 <= A && A <80) {
			System.out.println("C");
		} else if(60 <= A && A <70) {
			System.out.println("D");
		} else if(A < 60) {
			System.out.println("F");
		} 
	}
}
