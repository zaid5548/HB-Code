package Simple_Concept;

import java.util.Scanner;


public class PrintAllPrime {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int low=scn.nextInt();
		int hi=scn.nextInt();
		int cnt=0;
		
		for(int i=low;i<=hi;i++) {
			
			boolean ans=isPrime(i);
			if(ans) {
				//System.out.print(i+" ");
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static boolean isPrime(int n) {
		boolean flag=true;
		if(n==1 || n==0) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
		
	}
}
