package Problem_Phase_1;

import java.util.Scanner;

public class ReverseArray_Inplace {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=scn.nextInt();
		System.out.println("Enter the Element of Array");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scn.nextInt();
			
		}
		
		reverseArray(arr);

	}

	private static void reverseArray(int[] arr) {

		int lo=0;
		int hi=arr.length-1;
		
		while(lo<=hi) {
			
			int temp=arr[lo];
			arr[lo]=arr[hi];
			arr[hi]=temp;
			lo++;
			hi--;
			
		}
		
		System.out.println("After Reverse Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
