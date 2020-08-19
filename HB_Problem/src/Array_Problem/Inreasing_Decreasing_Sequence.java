package Array_Problem;

import java.util.Scanner;

public class Inreasing_Decreasing_Sequence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int n1=Max(arr);
		int n2=Min(arr);
		if(arr[0]==n2) {
			boolean ans=sequenceInc(arr);
		}
		if(arr[0]==n1){
			boolean ans=sequenceDec(arr);
		}
		
		if(sequenceInc(arr) || sequenceDec(arr)) {
			System.out.println("true");
		}else {
			System.out.println("fasle");
		}
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

	private static boolean sequenceDec(int[] arr) {
		int m=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(m>arr[i]) {
				m=arr[i];
			}else {
				return false;
			}
		}
		
		return true;
	}

	private static boolean sequenceInc(int[] arr) {
		
		int m=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(m<arr[i]) {
				m=arr[i];
			}else {
				return false;
			}
		}
		
		return true;
	}

}
