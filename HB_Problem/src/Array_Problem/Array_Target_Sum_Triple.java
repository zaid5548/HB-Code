package Array_Problem;

import java.util.Scanner;

public class Array_Target_Sum_Triple {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=scn.nextInt();
		}
		int target=scn.nextInt();
		int[] arr=sort(arr1);
		Sumpair(arr,target);

	}

	private static int[] sort(int[] arr1) {
		
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=0;j<arr1.length-i-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		
		return arr1;
	}

	private static void Sumpair(int[] arr, int t) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==t) {
						int a=Math.min(arr[i], Math.min(arr[j], arr[k]));
						int c=Math.max(arr[i], Math.max(arr[j], arr[k]));
						int b=t-(a+c);
						System.out.println(a+", "+b+" and "+c);
					}
				}
			}
		}
	}
	
}
