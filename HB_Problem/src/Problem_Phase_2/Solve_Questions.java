

package Problem_Phase_2;

import java.util.Scanner;

public class Solve_Questions {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-- > 0) {
			
			int n=scn.nextInt();
			int m=scn.nextInt();
			int[] deepak=new int[n];
			int[] gautam=new int[m];
			for(int i=0;i<n;i++) {
				deepak[i]=scn.nextInt();
			}
			for(int i=0;i<m;i++) {
				gautam[i]=scn.nextInt();
			}
			
			int m1=max(deepak);
			int m2=max(gautam);
			
			if(m1<=m2) {
				System.out.println(m1+" "+"Deepak ");
			}else {
				System.out.println(m2+" "+"Gautam ");
			}
			
		}

	}
//

	private static int max(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
}
