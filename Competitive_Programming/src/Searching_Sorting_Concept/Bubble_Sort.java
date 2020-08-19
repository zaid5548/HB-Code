package Searching_Sorting_Concept;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		bubble_Sort(arr);

	}

	private static void bubble_Sort(int[] arr) {


		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
	}

}
