package Searching_Sorting_Concept;

import java.util.Scanner;

public class Insertion_Sort {

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
		
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0) {
				if(temp<arr[j]) {
					arr[j+1]=arr[j];
				}else {
					break;
				}
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println("Sorted Array**");
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
	}

}
