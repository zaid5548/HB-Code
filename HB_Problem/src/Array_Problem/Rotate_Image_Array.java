package Array_Problem;

import java.util.Scanner;

public class Rotate_Image_Array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		rotateArray(arr,n);
		displayMatrix(arr, n);

	}

	private static void rotateArray(int[][] ror,int N) {
		 for (int x = 0; x < N / 2; x++) {
	            for (int y = x; y < N - x - 1; y++) {
	                int temp = ror[x][y];
	                ror[x][y] = ror[y][N - 1 - x]; 
	                ror[y][N - 1 - x] 
	                    = ror[N - 1 - x][N - 1 - y]; 
	                ror[N - 1 - x][N - 1 - y] = ror[N - 1 - y][x]; 
	                ror[N - 1 - y][x] = temp; 
	            } 
	        } 
	}
	
	public static void displayMatrix(int arr[][],int n) { 
		 for (int i = 0; i <n; i++) { 
			 for (int j = 0; j <n; j++) 
	           System.out.print(arr[i][j]+" "); 
		            System.out.print("\n"); 
		        } 
		        System.out.print("\n"); 
		    }

}
