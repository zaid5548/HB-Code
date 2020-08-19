package Number_System;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] list=new int[n];
		for(int i=0;i<n;i++) {
			list[i]=scn.nextInt();
		}
		int[] ans=getPositive(list);
		for(int val:ans) {
			System.out.println(val);
		}
	}

	private static int[] getPositive(int[] list) {
		int sum=0;
		
		int[] res=new int[list.length];
		for(int i=0;i<list.length;i++) {
			sum+=list[i];
			if(sum>=0) {
				res[i]=list[i];
//				continue;
			}else {
				break;
			}
			
		}
		
		return res;
	}

}
