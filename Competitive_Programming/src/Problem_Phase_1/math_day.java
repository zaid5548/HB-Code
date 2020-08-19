package Problem_Phase_1;

import java.util.Scanner;

public class math_day {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
			int a=scn.nextInt();
			int n=scn.nextInt();
			int p=scn.nextInt();
			int fact=factorial(n);
			int ans=(int)Math.pow(a, fact);
			int res=ans%p;
			System.out.println(res);
			
			
			t--;
		}

	}

	private static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
