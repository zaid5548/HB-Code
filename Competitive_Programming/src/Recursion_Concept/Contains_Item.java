package Recursion_Concept;

import java.util.Scanner;

public class Contains_Item {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		} 
		int m=scn.nextInt();
		boolean ans=false;
		ans=contaisItem(arr,m,0);
		if(ans){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
    }
	static boolean res=false;
	public static boolean contaisItem(int[] arr,int item,int vidx){
		
		if(vidx==arr.length) {
			return false;
		}

		if(arr[vidx]==item) {
			return true;
		}
		
		res=res || contaisItem(arr, item, vidx+1);
		
		return res;

	}

	
}
