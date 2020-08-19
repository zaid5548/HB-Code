package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst1=1;
		int nst2=1;
		int nsp=n*2-1;
		int val2=n;
		int row=1;
		while(row<=n*2+1) {
			int val=n;
			int ans=val2;
			for(int st=1;st<=nst1;st++) {
				System.out.print(val--);
			}
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" ");
			}
			for(int st=1;st<=nst2;st++) {
				System.out.print(ans);
				ans++;
			}
			System.out.println();
			if(row<(n*2+1)/2+1) {
				nst1++;
				nsp-=2;
				val2--;
				nst2++;
			}else {
				nst1--;
				nsp+=2;
				val2++;
				nst2--;
			}
			
			
			row++;
		}
	}

}
