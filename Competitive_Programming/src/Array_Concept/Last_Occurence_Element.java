package Array_Concept;

import java.util.Scanner;

public class Last_Occurence_Element {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int m=scn.nextInt();
		System.out.println(findLastIndex(arr,m));
		
	}

	private static int findLastIndex(int[] arr, int m) {
		
		int ans=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==m) {
				ans=i;
			}
		}
		
		return ans;
	}

}
