package Problem_Phase_2;

import java.util.Scanner;

public class Compute_Function_N {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-- > 0) {
			
			int n=scn.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++) {
				if(i%2==0) {
					sum+=i;
				}else {
					sum-=i;
				}
			}
			System.out.println(sum);
			
		}

	}

}
