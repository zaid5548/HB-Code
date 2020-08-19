package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Pattern_Number_Ladder {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int cnt=1;
		while(row<=n){
			int nst=row;
			for(int i=1;i<=nst;i++){
				System.out.print(cnt+"\t");
				cnt++;
			}
			row++;
			System.out.println();
		}	
    }
	
}
