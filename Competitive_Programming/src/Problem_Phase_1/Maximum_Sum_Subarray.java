package Problem_Phase_1;

import java.util.Scanner;

public class Maximum_Sum_Subarray {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
			
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			int curr_Sum=0;
			int Max_Sum=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				curr_Sum+=arr[i];
				Max_Sum=Math.max(Max_Sum, curr_Sum);
				if(curr_Sum<0) {
					curr_Sum=0;
				}
				
			}
			System.out.println(Max_Sum);
			
			t--;
		}

	}

	

}
