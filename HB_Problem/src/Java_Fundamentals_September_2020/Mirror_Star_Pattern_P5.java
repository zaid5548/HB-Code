package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Mirror_Star_Pattern_P5 {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int nsp=n/2;
		int row=1;
		while(row<=n){
			for(int sp=1;sp<=nsp;sp++){
				System.out.print(" "+"\t");
			}
			for(int st=1;st<=nst;st++){
				System.out.print("*"+"\t");
			}
			if(row<=n/2){
				nst+=2;
				nsp--;
			}else{
				nst-=2;
				nsp++;
			}
			row++;
			System.out.println();
		}
    }
	
}
