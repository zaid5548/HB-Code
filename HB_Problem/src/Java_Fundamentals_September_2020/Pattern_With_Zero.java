package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Pattern_With_Zero {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		while(row<=n) {
			for(int st=1;st<=row;st++) {
				if(st==nst || st==row) {
					System.out.print(row+"\t");
				}else {
					System.out.print("0"+"\t");
				}
			}
			System.out.println();
			row++;
			
		}

	}

}
