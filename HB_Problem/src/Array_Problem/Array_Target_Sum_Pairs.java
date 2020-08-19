package Array_Problem;

import java.util.Scanner;

public class Array_Target_Sum_Pairs {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int target=scn.nextInt();
		Sumpair(arr,target);

	}

	private static void Sumpair(int[] arr, int t) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==t) {
					int a=Math.min(arr[i], arr[j]);
					int b=Math.max(arr[i], arr[j]);
					System.out.println(a+" and "+b);
				}
			}
		}
	}

}
