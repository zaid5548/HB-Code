package Array_Problem;

import java.util.Scanner;

public class Maximum_SubArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int max=MaxSubArray(arr);
		System.out.println(max);
		t--;
		}
	}

	private static int MaxSubArray(int[] arr) {
		int sum=0;
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
