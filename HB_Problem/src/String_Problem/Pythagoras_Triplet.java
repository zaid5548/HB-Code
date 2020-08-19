package String_Problem;

import java.util.Scanner;

public class Pythagoras_Triplet {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(n==1 || n==0) {
			System.out.println("-1");
		}else if(n%2==0) {
			long ans=n*n/4;
			System.out.println(ans-1+" "+ans+1);
		}else if(n%2!=0) {
			long ans=n*n+1;
			System.out.println(ans/2-1+" "+ans/2);
		}
	}


}
