package Array_Problem;

import java.util.Scanner;

public class Array_Linear_Search {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int item=scn.nextInt();
		int ans=search(arr,item);
		System.out.println(ans);

	}

	private static int search(int[] arr, int item) {
//		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
