package Array_Practice;

import java.util.Scanner;

public class Max_Linear_Search {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.println("Enter The size of array");
//		int n=scn.nextInt();
//		System.out.println("Enter the Element of Array");
//		int[] arr=new int[n];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=scn.nextInt();
//		}
		int[] arr= {5,1,2,9,3,8};
		//BubbkeSort(arr);
		//SelectionSort(arr);
		InsertionSort(arr);

		//InsertionSort2(arr);
//rotate(arr, 3);
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
		//max(arr);
//		reverse(arr);
//		for(int val:arr)
//		{
//			System.out.print(val+" ");
//		}
		//System.out.println(LinearSearch(arr,66));
		//SecondLargest(arr);
		//System.out.println(BinarySearch(arr, 22));
		//System.out.println(BinarySearch1(arr, 2));

	}
	public static void max(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Number is :"+max);
	}
	public static int LinearSearch(int[] arr,int item)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				return i;
			}
		}
		return -1;
	}
	public static void SecondLargest(int[] arr)
	{
		int sl=arr[0];
		int fl=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]>sl)
			{
				sl=arr[i];
			}
		}
		System.out.println(sl);
	}
	// 11 22 33 111 344 553 123 
	public static int BinarySearch1(int[] arr,int item)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
		if(item>arr[mid])
		{
			low=mid+1;
		}
		else if(item<arr[mid])
		{
			high=mid-1;
		}
		else
		{
			return mid;
		}
		}	
		
		return -1;
	}
	public static void reverse(int[] arr)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
	public static void rotate(int[] arr,int shift)
	{
		for(int k=0;k<shift;k++)
		{
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		}
		}

	public static void BubbkeSort(int[] arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
	}

	public static void SelectionSort(int[] arr)
	{
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
			if(arr[j]<arr[min])
			{
				min=j;		
			}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}

	public static void InsertionSort(int[] arr)
	{
		
		for(int i=1;i<=arr.length-1;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0)
			{
				if(arr[j]>temp)
				{
					arr[j+1]=arr[j];
				}
				else
				{
					break;
				}
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void InsertionSort2(int[] arr)
	{
		
		for(int i=1;i<=arr.length-1;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
					arr[j+1]=arr[j];
				
				
				j--;
			}
			arr[j+1]=temp;
		}
	}






}
