package Problem_Phase_1;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		binaryToDecimal(n);

	}

	private static void binaryToDecimal(long n) {
		long ans=0;
		long mul=0;
		int base=2;
		while(n>0) {
			long temp=n%10;
			ans=ans+temp*(long)Math.pow(base, mul);
			n/=10;
			mul++;
		}
		System.out.println(ans);
	}

}
