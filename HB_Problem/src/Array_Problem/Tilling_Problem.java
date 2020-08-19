package Array_Problem;

import java.util.Scanner;

public class Tilling_Problem {
	static int C =1000000007;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-->0) {
			
			int n=scn.nextInt();
			int m=scn.nextInt();
			int ans=func(n,m);
			System.out.println(ans);
		}

	}

	private static int func(int n, int m) {
		int[] arr=new int[n+1];
		arr[0]=arr[1]=1;
		for(int i=2;i<=n;i++) {
			if(i>=m)
				arr[i]=(arr[i-1]+arr[i-m])%C;
			else
				arr[i]=arr[i-1];
		}
		return arr[n];
	}

}
