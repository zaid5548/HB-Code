package Simple_Concept;

import java.util.Scanner;

public class Array_Max_LinearSearch {

	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		
		int size=scn.nextInt();
		int[] arr=TakeInput(size);
		display(arr);
		System.out.println("******************");
		System.out.println("Maximum Value of in this given Array");
		System.out.println(MaxValue(arr));
		System.out.println("////////////////////////////////");
		
		LinearSearch(arr,5);
		System.out.println(SecondLargestNumber(arr));
	}
	
	private static int[] TakeInput(int size) {
		
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		
		return arr;
	}
	
	
	private static void display(int[] arr){
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	private static int MaxValue(int[] arr) {
		
		int m=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>m) {
				m=arr[i];
			}
		}
		return m;
		
	}
	
	private static void LinearSearch(int[] arr, int val) {
		
		for(int i=0;i<arr.length;i++) {
			if(val==arr[i]) {
				System.out.println("Value is present at "+i+"  Position");
			}
		}
		
		
	}


	private static int SecondLargestNumber(int[] arr) {
		

		int firstLargest=arr[0];
		int secondLargest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}
			else {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
}
