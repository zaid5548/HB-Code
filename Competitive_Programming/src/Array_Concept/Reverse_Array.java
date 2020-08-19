package Array_Concept;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		rverse(arr);

	}

	private static void rverse(int[] arr) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<hi) {
			for(int i=lo;i<hi;i++) {
				int temp=arr[lo];
				arr[lo]=arr[hi];
				arr[hi]=temp;
				lo++;
				hi--;
			}
		}
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
		
	}

}
