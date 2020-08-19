package Array_Concept;

import java.util.Scanner;

public class Two_D_Array_I_O {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);

		System.out.println("Enter the size of row");
		int n=scn.nextInt();
		System.out.println("Enter the size of column");
		int m=scn.nextInt();
		System.out.println("Enter the element of array");
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		System.out.println("Printed the array element");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
