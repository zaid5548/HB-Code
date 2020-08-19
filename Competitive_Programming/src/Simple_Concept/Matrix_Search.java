package Simple_Concept;

import java.util.Scanner;

public class Matrix_Search {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=scn.nextInt();
			}
		}
		int item=scn.nextInt();
		if(search(arr,item)){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
    }
	public static boolean search(int[][] arr,int item){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==item){
					return true;
				}
			}
		}
		return false;
	}
}
