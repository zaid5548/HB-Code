package Array_Problem;

import java.util.Scanner;

public class Maximum_Length_Bitonic_SubArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
			
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			System.out.println(MLBS(arr));
//			System.out.println(bitonic(arr));
			t--;
		}
		

	}

	private static int MLBS(int[] arr) {
		
		int[] lis=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			lis[i]=1;
		}
		
//		left to right
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && lis[i]<lis[j]+1) {
					lis[i]=lis[j]+1;
				}
			}
		}
		
		int[] lds=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			lds[i]=1;
		}
		
		for(int i=arr.length-2;i>=0;i--) {
			for(int j=arr.length-1;j>i;j--) {
				if(arr[i]>arr[j] && lds[i]<lds[j]+1) {
					lds[i]=lds[j]+1;
				}
			}
		}
		
		int max=lis[0]+lds[0]-1;
		for(int i=1;i<arr.length;i++) {
			if(lis[i]+lds[i]-1>max) {
				max=lis[i]+lds[i];
			}
		}
		
		return max;
	}

	 public static int bitonic(int arr[]) 
	    { 
	        int n=arr.length;
	        int[] inc = new int[n]; 

	        int[] dec = new int[n]; 
	        int max; 

	        inc[0] = 1; 
	        dec[n-1] = 1; 
	        for (int i = 1; i < n; i++) 
	           inc[i] = (arr[i] >= arr[i-1])? inc[i-1] + 1: 1; 
	        for (int i = n-2; i >= 0; i--) 
	            dec[i] = (arr[i] >= arr[i+1])? dec[i+1] + 1: 1; 
	        max = inc[0] + dec[0] - 1; 
	        for (int i = 1; i < n; i++) 
	            if (inc[i] + dec[i] - 1 > max) 
	                max = inc[i] + dec[i] - 1; 

	        return max; 
	    } 

}
