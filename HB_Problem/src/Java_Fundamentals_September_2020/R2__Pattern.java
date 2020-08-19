package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class R2__Pattern {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
//		for(int i=n;i>=1;i--) {
//			if(i%2!=0) {
//				System.out.println(i);
//			}
//		}
//		for(int i=1;i<=n;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		now(n);
	}

//	using recursion
	
	private static void now(int n) {
		if(n < 1) {
			return ;
		}
		if(n % 2 != 0) {
			System.out.println(n);
		}
		now(n - 1);
		if(n % 2 == 0) {
			System.out.println(n);
		}		
	}

}
