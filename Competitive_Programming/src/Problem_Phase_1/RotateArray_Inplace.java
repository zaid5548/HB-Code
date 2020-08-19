package Problem_Phase_1;

import java.util.Scanner;

public class RotateArray_Inplace {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=scn.nextInt();
		System.out.println("Enter the Element of Array");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scn.nextInt();
			
		}
		
		rotateArray(arr,-3);

	}

	private static void rotateArray(int[] arr,int r) {
		
		r=r%arr.length;
		
		if(r<0) {
			r+=arr.length;
		}
		
		while(r>0) {
	int temp=arr[arr.length-1];
	for(int i=arr.length-1;i>=1;i--) {
		arr[i]=arr[i-1];
	}
		arr[0]=temp;
	
		
		
		r--;
	}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
