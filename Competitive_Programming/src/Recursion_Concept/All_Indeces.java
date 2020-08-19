package Recursion_Concept;

import java.util.Scanner;

public class All_Indeces {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int[] arr= {2,8,2,1,3,8,4,6,2,8,5};
		int[] ans=allindeces(arr,0,2,0);
		for(int val:ans) {
			System.out.print(val+" ");
		}
	}

	public static int[] allindeces(int[] arr, int i, int item, int cnt) {
		if(i==arr.length) {
			int[] base=new int[cnt];
			return base;
		}
		int[] indeces=null;
		if(arr[i]==item) {
			indeces=allindeces(arr, i+1, item, cnt+1);
		}else {
			indeces=allindeces(arr, i+1, item, cnt);
		}	
		if(arr[i]==item) {
			indeces[cnt]=i;
		}
		return indeces;
	}

}
