package Array_Concept;

import java.util.Scanner;

public class Wave_Array_Display {

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
			if(c%2==0) {
				for(int r=0;r<arr.length;r++) {
					System.out.print(arr[r][c]+" ");
				}
			}else {
				for(int r=arr.length-1;r>=0;r--) {
					System.out.print(arr[r][c]+" ");
				}
			}
		}
	}

}


//3
//4
//1 2 3 4
//5 6 7 8
//9 10 11 12