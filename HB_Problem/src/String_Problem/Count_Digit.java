package String_Problem;

import java.util.Scanner;

public class Count_Digit {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		int s=scn.nextInt();
		int count=searchCountDigit(n,s);
		System.out.println(count);
	}

	private static int searchCountDigit(long n, int s) {
		int cnt=0;
		while(n>0) {
			long temp=n%10;
			if(temp==s) {
				cnt++;
			}
			n/=10;
		}
		return cnt;
	}

}
