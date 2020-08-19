package Simple_Concept;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scn.nextInt();
//		isPrime_1(n);
		isPrime_2(n);
		
		
		
	}

	private static void isPrime_2(int n) {
		
		int flag=1;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				flag=0;
				break;
			}
		}
		
		if(flag==1) {
			System.out.print("Number is Prime");
		}
		else {
			System.out.print("Number is Not Prime");
		}
		
	}

	private static void isPrime_1(int n) {
		
		int fact=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
			{
				fact++;
			}
		}
		
			if(fact==2) {
				System.out.println("Number is Prime ");
			}else {
				System.out.println("Number is not prime");
			}
		
	}



}
