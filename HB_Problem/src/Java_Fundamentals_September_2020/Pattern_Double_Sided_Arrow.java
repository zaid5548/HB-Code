package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst1=1;
		int nst2=1;
		int nsp=n-1;
		int nsp2=-1;
		int row=1;
		while(row<=n) {
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" "+" ");
			}
			for(int st=nst1;st>=1;st--) {
				System.out.print(st+" ");
			}
			if(row>1 && row<n) {
				for(int sp=1;sp<=nsp2;sp++) {
					System.out.print(" "+" ");
				}
				for(int st=1;st<=nst2;st++) {
					System.out.print(st+" ");
				}
			}
			
			System.out.println();
			if(row<=n/2) {
				nst1+=1;
				nsp-=2;
				nst2+=1;
				nsp2+=2;
			}else {
				nsp+=2;
				nst1-=1;
				nsp2-=2;
				nst2-=1;
			}
			
			row++;
		}
	}

}
