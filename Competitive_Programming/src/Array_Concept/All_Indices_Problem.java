package Array_Concept;

import java.util.Scanner;

public class All_Indices_Problem {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int m=scn.nextInt();

		AllIndices(arr,m);
	}

	private static void AllIndices(int[] arr, int m) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==m) {
				System.out.print(i+" ");
			}
		}
		
	}

}
