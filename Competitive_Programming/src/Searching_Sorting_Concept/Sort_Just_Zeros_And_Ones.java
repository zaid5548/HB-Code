package Searching_Sorting_Concept;

import java.util.Scanner;

public class Sort_Just_Zeros_And_Ones {
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		} 
		sort(arr,n);
		   
    }
	public static void sort(int[] arr,int n){
		 int term = 0; 
//		 int[] ans=new int[n]; 
        for (int i = 0; i <n; i++) { 
            if (arr[i] == 0) 
                term++; 
        }

        for (int i = 0; i < term; i++) 
        	arr[i] = 0; 

        for (int i = term; i < arr.length; i++) 
        	arr[i] = 1; 
        
        for (int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
	}
}
