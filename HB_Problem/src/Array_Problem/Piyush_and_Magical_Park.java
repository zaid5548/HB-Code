package Array_Problem;

import java.util.Scanner;

public class Piyush_and_Magical_Park {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int k=scn.nextInt();
		int s=scn.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=scn.next().charAt(0);
			}
		}
		int ans=s;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(ans>=k) {
				if(arr[i][j]=='.') {
					ans=ans-2;
					if(j<=m-2) {
						ans-=1;
					}
				}else if(arr[i][j]=='*') {
					ans=ans+5;
					if(j<=m-2) {
						ans-=1;
					}
				}else if(arr[i][j]=='#') {
					break;
				}
			 }else {
				 System.out.print("No");
					return;
			 }
			}
		}
		System.out.println("Yes");
		System.out.println(ans);
	}

}
