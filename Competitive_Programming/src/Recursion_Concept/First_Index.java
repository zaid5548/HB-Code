package Recursion_Concept;

import java.util.Scanner;

public class First_Index {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int[] arr= {2,8,2,1,3,1,4,6,2,8,5};
		
		System.out.println(firstindex(arr,0,1));
		System.out.println(lastindex(arr,0,1));

	}

	private static int lastindex(int[] arr, int i, int item) {
		if(i==arr.length) {
			return -1;
		}
		int ans=lastindex(arr, i+1, item);
		
		if(ans==-1) {
			if(arr[i]==item) {
				return i;
			}else {
				return -1;
			}
		}else {
			return ans;
		}
	}

	private static int firstindex(int[] arr, int i, int item) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}else {
			int ans=firstindex(arr, i+1, item);
			return ans;
		}
	}

}
