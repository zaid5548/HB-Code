package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Pattern_Number_Star_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int nsp=n-1;
		int row=1;
		while(row<=n) {
			int val=1;
			for(int st=1;st<=row;st++) {
				System.out.print(val++);
			}
			for(int sp=1;sp<=nsp;sp++) {
				System.out.print("*");
			}
			System.out.println();
			nsp--;
			row++;
		}

	}

}
