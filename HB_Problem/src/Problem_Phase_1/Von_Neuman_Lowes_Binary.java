package Problem_Phase_1;

import java.util.Scanner;

public class Von_Neuman_Lowes_Binary {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long t=scn.nextLong();
		while(t>0) {
			int n=scn.nextInt();
			binaryToDecimal(n);
			
			t--;
		}
		

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
