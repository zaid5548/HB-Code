package Array_Problem;

import java.util.Scanner;

public class Sorted_Array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
//		Type--- 1
//		int n1=Max(arr);
//		int n2=Min(arr);
//		if(arr[0]==n2) {
//			boolean ans=sortInc(arr);
//		}
//		if(arr[0]==n1){
//			boolean ans=sortDec(arr);
//		}
//		
//		if(sortInc(arr) || sortDec(arr)) {
//			System.out.println("true");
//		}else {
//			System.out.println("fasle");
//		}
		
		
//		type -- 2
		boolean y=isSorted(arr,n);
		if(y) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}
	
	private static boolean isSorted(int[] arr, int n) {
		if(n==1)
		  {
		    return true;
		  }
		  if(arr[0]<=arr[1] && isSorted(arr,n-1))
		  {
		    return true;
		  }
		  return false;
	}

	private static int Min(int[] arr) {
		int min=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}

	private static int Max(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

	private static boolean sortDec(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				return false;
			}
		}
		return true;
		
	}

	private static boolean sortInc(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max>arr[i]) {
				return false;
			}
		}
		return true;
		
	}



}
