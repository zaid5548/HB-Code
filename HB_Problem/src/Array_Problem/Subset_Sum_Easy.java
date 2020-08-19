package Array_Problem;

import java.util.Scanner;

public class Subset_Sum_Easy {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-->0) {	
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			boolean ans=subsetSumEasy(arr);
			if(ans)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
	}

	private static boolean subsetSumEasy(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum=arr[i]+arr[j];
				if(sum==0) {
					return true;
				}
			}
		}
		
		return false;
	}

}
