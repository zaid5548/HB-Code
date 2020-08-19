package Problem_Phase_1;

import java.util.Scanner;

public class Decimal_To_Octal {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		decimalToOctal(n);

	}

	private static void decimalToOctal(long n) {
		long ans=0;
		long mul=0;
		int base=10;
		while(n>0) {
			long temp=n%8;
			ans=ans+temp*(long)Math.pow(base, mul);
			n/=8;
			mul++;
		}
		System.out.println(ans);
	}
	
}
