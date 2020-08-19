package Problem_Phase_1;

import java.util.Scanner;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
			int num=scn.nextInt();
			int[] arr=new int[num];
			for(int i=0;i<arr.length;i++) {
				arr[i]=scn.nextInt();
			}
			
			System.out.println(cirsularSum(arr));
			
			t--;
		}

	}
	
	public static int cirsularSum(int[] arr) {
		int Internal_Sum=kadare(arr);
		
		int total_Sum=0;
		for(int i=0;i<arr.length;i++) {
			total_Sum+=arr[i];
			arr[i]=-arr[i];
		}
		
		int non_wrap=kadare(arr);
		int wrap_Sum=total_Sum+non_wrap;
		
		return Math.max(Internal_Sum, wrap_Sum);
	}
	
	public static int kadare(int[] arr) {
		int curr_Sum=0;
		int Max_Sum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			curr_Sum+=arr[i];
			Max_Sum=Math.max(Max_Sum, curr_Sum);
			if(curr_Sum<0) {
				curr_Sum=0;
			}
			
		}
		return Max_Sum;
	}

}
