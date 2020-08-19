package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Pascal_Triangle_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
//		int nsp=n-1;
		int row=0;
		while(row<n) {
//			for(int sp=1;sp<=nsp;sp++) {
//				System.out.print(" "+"\t");
//			}
			nst=1;
			for(int st=0;st<=row;st++) {
				System.out.print("\t"+nst+"\t");
				nst=nst*(row-st)/(st+1);
			}
			System.out.println();
//			nsp--;
			row++;
		}

	}

}
