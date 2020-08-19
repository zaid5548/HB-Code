package Problem_Phase_1;

import java.util.Scanner;

public class Broken_Calculator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int ans=calculator(n);
		System.out.println(ans);

	}

	private static int calculator(int n) {
		int res=1;
		while(n!=0) {
			res=res*n;
			n--;
		}
		return res;
	}

}
