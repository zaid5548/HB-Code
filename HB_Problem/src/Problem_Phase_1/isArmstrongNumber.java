package Problem_Phase_1;

import java.util.Scanner;

public class isArmstrongNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(isArmstrong(n)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

	private static boolean isArmstrong(int n) {
		int num=n;
		int t=node(num);
		int ans=0;
		while(n>0) {
			int temp=n%10;
			ans+=Math.pow(temp, t);
			n/=10;
		}
		if(ans==num) {
			return true;
		}else {
			return false;
		}
	}

	private static int node(int n) {
		int cnt=0;
		while(n>0) {
			int temp=n%10;
			cnt++;
			n/=10;
		}
		return cnt;
	}

}
