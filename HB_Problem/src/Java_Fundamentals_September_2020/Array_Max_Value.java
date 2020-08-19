package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Array_Max_Value {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans=MaxElement(arr);
		System.out.println(ans);

	}

	private static int MaxElement(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
