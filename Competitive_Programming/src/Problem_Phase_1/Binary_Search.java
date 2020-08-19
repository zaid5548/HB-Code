package Problem_Phase_1;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scn.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elemen of arrayt ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("Enter the element to be search in this array");
		int val=scn.nextInt();
		binarysearch(arr, val);

	}

	public static void binarysearch(int[] arr,int item) {
		
		int first = 0;
		int last = arr.length - 1;
		int middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( arr[middle] < item )
	           first = middle + 1;
	         else if ( arr[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	}
	
	
}
