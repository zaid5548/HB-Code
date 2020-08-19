package Problem_Phase_2;

import java.util.Scanner;

public class Prateek_Loves_Candy {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-->0) {
			
			int n=scn.nextInt();
			int p=0;
			int cnt=0;
			int i=2;
			while(cnt<n) {	
//				if(i==0 || i==1)
//					continue;
					
				if(isPrime(i)) {
					p=i;;
					cnt++;
				}
				i++;	
				
			}
			
			System.out.println(p);
			
			
		}

	}

	private static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
