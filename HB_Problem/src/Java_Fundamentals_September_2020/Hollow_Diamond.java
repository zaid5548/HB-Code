package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Hollow_Diamond {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=n/2;
		int nsp=1;
		int row=1;
		for(int st=1;st<=n;st++) {
			System.out.print("*"+"\t");
		}
		System.out.println();
		while(row<=n-2) {
			for(int st=1;st<=nst;st++) {
				System.out.print("*"+"\t");
			}
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" "+"\t");
			}
			for(int st=1;st<=nst;st++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
			if(row<=(n-2)/2) {
				nst--;
				nsp+=2;
				
			}else {
				nst++;
				nsp-=2;
			}
			row++;
		}
		for(int st=1;st<=n;st++) {
			System.out.print("*"+"\t");
		}

	}

}
