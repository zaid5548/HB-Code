package Searching_Sorting;

import java.util.Scanner;

public class Merged_Sort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int[] ans=sort(arr, 0, arr.length-1);
		for(int val:ans) {
			System.out.print(val+" ");
		}
	}

	private static int[] sort(int[] arr,int lo,int hi) {
		if(lo==hi) {
			int[] br=new int[1];
			br[0]=arr[lo];
			return br;
		}
		
		
		int mid=(lo+hi)/2;
		
		int[] fh=sort(arr, lo, mid);
		int[] sh=sort(arr, mid+1, hi);
		
		int[] sort=merged(fh,sh); 
		
		return sort;
	}

	private static int[] merged(int[] fh, int[] sh) { 
		int cnt=0;
		int i=0,j=0;
		int[] arr=new int[fh.length+sh.length];
		while(i<fh.length && j<sh.length) {
			if(fh[i]<sh[j]) {
				arr[cnt]=fh[i];
				cnt++;
				i++;
			}else {
				arr[cnt]=sh[i];
				j++;
				cnt++;
			}
			
		}
		while(i<fh.length) {
			arr[cnt]=fh[i];
			i++;
			cnt++;
		}
		
		while(j<sh.length) {
			arr[cnt]=sh[j];
			j++;
			cnt++;
		}
		return arr;
	}

}
