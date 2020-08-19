package Array_Problem;

import java.util.Scanner;

public class Matrinx_Search {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		int item=scn.nextInt();
		int ans=matrixSearch(arr,item);
		System.out.println(ans);
	}

	private static int matrixSearch(int[][] arr,int item) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==item) {
					return 1;
				}
			}
		}
		return 0;
	}

}
