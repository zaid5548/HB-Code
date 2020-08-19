package Recursion_Concept;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int ans=fact(n);
		System.out.println(ans);
	}

	private static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		return n*fact(n-1);
		
	}

}
