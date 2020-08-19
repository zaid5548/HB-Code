package Pattern_Concept;

import java.util.Scanner;

public class Pascal_Tringle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int nsp=n;
		int row=0;
		while(row<n) {
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print(" ");
			}
			nst=1;
			for(int st=0;st<=row;st++) {
				System.out.print(nst+" ");
				nst=nst*(row-st)/(st+1);
			}
			System.out.println();
			nsp--;
			row++;
		}

	}

}
