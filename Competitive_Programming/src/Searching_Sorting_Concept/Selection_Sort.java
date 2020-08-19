package Searching_Sorting_Concept;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		sort(arr);

	
	}
	private static void sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
	}

}
