package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Manmohan_Loves_Pattern_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int row=1;
		while(row<=n) {
			if(row%2==0 && row>2) {
				for(int st=1;st<=nst;st++) {
					if(st==1 || st==nst) {
						System.out.print("1");
					}else {
						System.out.print("0");
					}
				}
			}else {
				for(int st=1;st<=nst;st++) {
					System.out.print("1");
				}
			}
			System.out.println();
			nst++;
			row++;
		}
	}

}
