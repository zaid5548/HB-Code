package Array_Problem;

import java.util.Scanner;

public class Median_Of_Sorted_Array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=scn.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=scn.nextInt();
		}
		
		int[] sort=merged(arr1,arr2);
		int sum=0;
		for(int val:sort) {
			sum+=val;
		}
		int median=getMedian(sort,n);
//		int ans=sum/median;
		System.out.println(median);

	}

	private static int getMedian(int[] sort,int n) {
		int sum=0;
		for(int i=0;i<sort.length;i++) {
			if(i==n-1 || i==n) {
				sum+=sort[i];
			}
		}
		int mid=sum/2;
		return mid;
	}

	private static int[] merged(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		int idx=0;
		int[] res=new int[arr1.length+arr2.length]; 
		while(i<arr1.length) {
			if(arr1[i]<arr2[j]) {
				res[idx]=arr1[i];
				i++;
				idx++;
			}
			else {
				res[idx]=arr2[j];
				j++;
				idx++;
			}
		}
		
		while(i<arr1.length) {
			res[idx]=arr1[i];
			idx++;
			i++;
		}
		while(j<arr2.length) {
			res[idx]=arr2[j];
			j++;
			idx++;
		}
		
		return res;
	}

}
