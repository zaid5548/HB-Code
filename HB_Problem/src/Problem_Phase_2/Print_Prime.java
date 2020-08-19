package Problem_Phase_2;

import java.util.Scanner;

public class Print_Prime {

	 public static void main(String args[]) {
			Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			prime(n);
	    }
		public static void prime(int n){
			for(int i=2;i<=n;i++){
				if(isprime(i)){
					System.out.println(i);
				}
			}
		}
		public static boolean isprime(int n){
			for(int i=2;i*i<=n;i++){
				if(n%i==0){
					return false;
				}
			}
			return true;
		}
	
}
