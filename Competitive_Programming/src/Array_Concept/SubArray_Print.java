package Array_Concept;

import java.util.Scanner;

public class SubArray_Print {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
			
		subarray(arr);
		
	}

	private static void subarray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
//					System.out.print(arr[k]+" ");
					sum+=arr[k];
				}
				System.out.println(sum);
				sum=0;
			}
		}
		
	}
	


}
