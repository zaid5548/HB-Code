


//  This code is not working 


//package Recursion_Problem;
//
//import java.util.Scanner;
//
//public class Subset_Recursion {
//
//	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in);
//		int n=scn.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=scn.nextInt();
//		}
//		for(int i=0,j=n-1;i<j;i++,j--)
//	         swap(arr[i],arr[j]); 
//		int m=scn.nextInt();
//		int out[]=new int[100];
//		for(int val:out)
//			out[val]=0;
//			
//		subsets_recursion(arr,out,m,0,n-1,0,n);
//
//	}
//
//	private static void subsets_recursion(int[] arr, int[] out, int m, int sum, int i, int j, int n) {
//		if(m==sum) {
//			for(int t=j-1;t>=0;j--) {
//				System.out.println(out[t]+" ");
//			}
//		}
//		
//		if(i<0) {
//			return;
//		}
//		if(sum>m) {
//			return;
//		}
//		
//		subsets_recursion(arr,out,m,sum,i-1,j,n);
//		out[j]=arr[i];
//		sum=sum+arr[i];
//		subsets_recursion(arr,out,m,sum,i-1,j+1,n);
//		
//	}
//
//	private static void swap(int i, int j) {
//		int temp=i;
//		i=j;
//		j=temp;
//		
//		
//	}
//
//}
