package Array_Problem;

import java.util.Scanner;

public class Arrays_Spiral_Print_Anticlockwise {

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
		
		spiral(arr);

	}

	private static void spiral(int[][] arr) {
		int minrow=0;
		int maxrow=arr.length-1;
		int mincol=0;
		int maxcol=arr[0].length-1;
		int total=arr.length*arr[0].length;
		int cnt=0;
		while(cnt<total) {
			
			for(int row=minrow;row<=maxrow&&cnt<total;row++) {
				System.out.print(arr[row][mincol]+" ");
				cnt++;
			}
			mincol++;
			
			for(int col=mincol;col<=maxcol&&cnt<total;col++) {
				System.out.print(arr[maxrow][col]+" ");
				cnt++;
			}
			maxrow--;
			
			for(int row=maxrow;row>=minrow&&cnt<total;row--) {
				System.out.print(arr[row][maxcol]+" ");
				cnt++;
			}
			maxcol--;
			
			for(int col=maxcol;col>=mincol&&cnt<total;col--) {
				System.out.print(arr[minrow][col]+" ");
				cnt++;
			}
			minrow++;
		}
		System.out.print("END");
	}

}
