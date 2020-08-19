package Recursion_Concept;

import java.util.Scanner;

public class Pring_Number_Dec {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
//		printDec(n);
//		printInc(n);
//		printAfeter_And_Before(n);
		print_PDIskip(n);
	}
	private static void print_PDIskip(int n) {
		if(n<=0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
		}
		print_PDIskip(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
		
	}
	private static void printAfeter_And_Before(int n) {
		if(n<=0) {
			return;
		}
		System.out.println(n);
		printAfeter_And_Before(n-1);
		System.out.println(n);
		
	}
	private static void printInc(int n) {
		if(n<=0) {
			return;
		}
		printInc(n-1);
		System.out.println(n);
		
	}
	public static void printDec(int n) {
		if(n<=0) {
			return;
		}
		System.out.println(n);
		printDec(n-1);
	}

}
