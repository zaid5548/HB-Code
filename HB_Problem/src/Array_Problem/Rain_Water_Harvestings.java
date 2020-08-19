package Array_Problem;

import java.util.Scanner;

public class Rain_Water_Harvestings {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(RainWater(arr));

	}

	private static int RainWater(int[] arr) {
		int i=0;
		int sum=0;
		while(i<arr.length) {
			int maxLeft=MaximumLeft(arr,i);
			int maxRight=MaximumRight(arr,i);
			int ans=Math.min(maxLeft, maxRight)-arr[i];
			i++;
			sum+=ans;
		}
		return sum;
	}

	private static int MaximumRight(int[] arr, int idx) {
		int max=Integer.MIN_VALUE;
		for(int i=idx;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	private static int MaximumLeft(int[] arr, int idx) {
		int max=Integer.MIN_VALUE;
		for(int i=idx;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
