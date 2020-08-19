package Array_Concept;

import java.util.Scanner;

public class Vertical_Display {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int row=scn.nextInt();
		int col=scn.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		for(int c=0;c<arr[0].length;c++) {
			for(int r=0;r<arr.length;r++) {
				System.out.print(arr[r][c]+" ");
			}
		}	

		
		
	
	}
}



