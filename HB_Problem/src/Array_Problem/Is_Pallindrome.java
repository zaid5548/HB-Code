package Array_Problem;

import java.util.Scanner;

public class Is_Pallindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		if(isPallindrome(arr)==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

	

	private static int isPallindrome(int[] arr) {
		 int flag = 0; 
		 int n=arr.length;
	        for (int i = 0; i <= n / 2 && n != 0; i++) {  
	            if (arr[i] != arr[n - i - 1]) { 
	                flag = 1; 
	                break; 
	            } 
	        } 
		return flag;
		
	}

}
