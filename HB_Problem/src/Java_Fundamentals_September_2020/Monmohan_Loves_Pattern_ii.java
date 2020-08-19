package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Monmohan_Loves_Pattern_ii {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		int val=1;
		while(row<=n) {
			if(row>2) {
				val++;
			}
			for(int st=1;st<=row;st++) {
				if(st==nst || st==row) {
					System.out.print(val);
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
			row++;
			
		}

	}

}
