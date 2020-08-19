package Array_Concept;

import java.util.Scanner;

public class Rain_Water_Harvesting {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
//		System.out.println(RainWater(arr));
		System.out.println(MaxSum(arr));
		
	}



	private static int RainWater(int[] arr) {
		
		int i=0;
		int sum=0;
		while(i<arr.length) {
			int MaxLeft=maximumLeft(arr,i);
			int MaxRight=maximumRight(arr,i);
			int ans=Math.min(MaxLeft, MaxRight)-arr[i];
			sum+=ans;
			i++;
		}
		return sum;
		
	}



	private static int maximumRight(int[] arr, int idx) {
		
		int max=Integer.MIN_VALUE;
		for(int i=idx;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}



	private static int maximumLeft(int[] arr, int idx) {
		int max=Integer.MIN_VALUE;
		for(int i=idx;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}
	
	
	
	public static int MaxSum(int[] arr) {
		int[] leftMax=new int[arr.length];
		int[] rightMax=new int[arr.length];
		
		leftMax[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			leftMax[i]=Math.max(leftMax[i-1],arr[i]);
		}
		
		rightMax[arr.length-1]=arr[arr.length-1];
		for(int i=rightMax.length-2;i>=0;i--) {
			rightMax[i]=Math.max(rightMax[i+1], arr[i]);
		}
		
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res+=Math.min(leftMax[i], rightMax[i])-arr[i];
		}
		
		return res;
	}
}
