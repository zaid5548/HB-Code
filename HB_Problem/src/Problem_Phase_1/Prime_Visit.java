package Problem_Phase_1;

import java.util.Scanner;

public class Prime_Visit {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
			int n=scn.nextInt();
			int m=scn.nextInt();
			int ans=PrimeVisit(n,m);
			System.out.println(ans);
			t--;
		}
	}

	private static int PrimeVisit(int a, int b) {
		  int countt = 0;
	      for(int i=a;i<=b;i++){
	            int j;
	        for( j=2;j<i;j++){
	            if(i%j == 0){
	                break;
	            }
	        }
	         if(j==i){
	            countt++;
	         }
	      }
		return countt;
	}

	private static boolean prime(int i) {
		boolean flag=true;
		for(int k=2;k<=i/2;k++) {
			if(i%k==0) {
				return false;
			}
		}
		return true;
	}

}
