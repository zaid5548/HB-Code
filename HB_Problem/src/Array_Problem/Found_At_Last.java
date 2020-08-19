package Array_Problem;

import java.util.Scanner;

public class Found_At_Last {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int item=scn.nextInt();
		int ans=found(arr,item);
		System.out.println(ans);
	}

	private static int found(int[] arr, int item) {
		int idx=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				idx=i;
			}
		}
		
		
		return idx;
	}

}
