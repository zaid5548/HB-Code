package Problem_Phase_2;

import java.util.Scanner;

public class Range_Odd_Divisior {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		printOddFactorNumber(n,m);

	}

	private static void printOddFactorNumber(int n, int m) {
		
		for(int i=n;i<=m;i++) {
			if((i>0) && ((i & (i-1))!=0)){
				System.out.print(i+" ");
			}
		}
		
	}

}

//case-1
//n=15 m=20
//15 17 18 19 20 

//case-2
//n=2 m=10
//3 5 6 7 9 10 
