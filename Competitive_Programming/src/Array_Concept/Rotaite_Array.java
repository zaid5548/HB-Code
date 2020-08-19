package Array_Concept;

import java.util.Scanner;

public class Rotaite_Array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		rotate(arr,3);

	}

	private static void rotate(int[] arr, int r) {
		
		while(r>0) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
			r--;
		}
		
		
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}

}
