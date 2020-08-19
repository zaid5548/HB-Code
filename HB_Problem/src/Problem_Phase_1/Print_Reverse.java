package Problem_Phase_1;

import java.util.Scanner;

public class Print_Reverse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		long ans=0;
		while(n>0) {
			long temp=n%10;
			ans=ans*10+temp;
			n/=10;
		}
		System.out.println(ans);
	}

}
