package Array_Concept;

import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {

		int[][] arr=takeinput();
		display(arr);

	}

	private static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static int[][] takeinput() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=scn.nextInt();
		int[][] arr=new int[row][];
		for(int r=0;r<arr.length;r++) {
			System.out.println("Enter the size of "+r+" column");
			int col=scn.nextInt();
			arr[r]=new int[col];
			for(int c=0;c<col;c++) {
				System.out.println("Enter the data of ["+row+" "+c+" ]" );
				arr[r][c]=scn.nextInt();
			}
			
		}
		return arr;
	}

}
