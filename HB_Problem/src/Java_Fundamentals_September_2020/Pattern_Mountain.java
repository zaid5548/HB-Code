package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst1=1;
		int nsp=n+1;
		int nst2=1;
		int row=1;
		while(row<=n) {
			
			for(int st=1;st<=row;st++) {
				System.out.print(st+"\t");
			}
			
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" "+"\t");
			}
			
			for(int st=nst2;st>=1;st--) {
				System.out.print(st+"\t");
			}
			System.out.println();
			if(row<n-1) {
				nst2++;
			}
			nsp-=2;
			row++;
		}
	}

}
