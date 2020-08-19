package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class pattern_number_Star_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=n-1;
		int nsp=1;
		int row=1;
		for(int st=1;st<=n;st++) {
			System.out.print(st+" ");
		}
		System.out.println();
		while(row<=n-1) {
			for(int st=1;st<=nst;st++) {
				System.out.print(st+" ");
			}
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print("*"+" ");
			}
			
			System.out.println();
			nst--;
			nsp+=2;
			row++;
		}

	}

}
