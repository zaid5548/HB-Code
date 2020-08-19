package Array_Concept;

import java.util.Scanner;

public class Boston_Number {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		boolean ans=isBoston(n);
		if(ans) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
	}
	
	public static boolean isBoston(int num) {
		
		int digitsum=SumOfDigit(num);
		int SumOfFactor=0;
		for(int i=2;i*i<=num;i++) {
			if(prime(i)) {
				while(num%i==0) {
					SumOfFactor+=SumOfDigit(i);
					num/=i;
				}
			}
		}
		
		if(num>1) {
			SumOfFactor+=SumOfDigit(num);
		}
		if(digitsum==SumOfFactor) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static int SumOfDigit(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}

	private static boolean prime(int n) {
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
