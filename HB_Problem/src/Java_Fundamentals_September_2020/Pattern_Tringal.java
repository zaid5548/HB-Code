package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Pattern_Tringal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		int nsp=n-1;
		while(row<=n) {
			int val=row;
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" "+"\t");
			}
			for(int st=1;st<=(row*2-1);st++) {
				System.out.print(val+"\t");
				if(st<=nst/2)
				val++;
				else
					val--;
			}
			
			nst=nst+2;
			nsp-=1;
			System.out.println();
			row++;

		}
	}

}
