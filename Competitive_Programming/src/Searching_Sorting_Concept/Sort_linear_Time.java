package Searching_Sorting_Concept;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_linear_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int[] ans=sort(arr);
		for(int val:ans) {
			System.out.println(val);
		}
		
	}

	private static int[] sort(int[] arr) {
		
		Arrays.sort(arr);
		return arr;
	}

}
