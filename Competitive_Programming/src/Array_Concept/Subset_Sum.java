package Array_Concept;

import java.util.Scanner;

public class Subset_Sum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			if(subset(arr,0,0,0)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
			t--;
		}

	}

	private static boolean subset(int[] arr, int i, int sum, int cnt) {
		
		if(i==arr.length) {
			if(sum==0 && cnt>0) {
				return true;
			}else {
				return false;
			}
		}
		
		boolean ans1=subset(arr, i+1, sum+arr[i], cnt+1);
		boolean ans2=subset(arr, i+1, sum, cnt);
		return ans1 ||ans2;
	}

}
