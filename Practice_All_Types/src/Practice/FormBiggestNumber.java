package Practice;

import java.util.Scanner;

public class FormBiggestNumber {

	public static void main(String[] args) {

		Scanner d=new Scanner(System.in);
		int tc=d.nextInt();
		while(tc>0)
		{
		int n=d.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=d.nextInt();
		}
		sort(arr);
		for(int val:arr)
		{
			System.out.print(val);
		}
		System.out.println();
		tc--;
		}
	}
	public static void sort(int[] arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(compare(arr[j],arr[j+1])==false)
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static boolean compare(int n1,int n2)
	{
		String s1=""+n1+n2;
		String s2=""+n2+n1;
		int ans=s1.compareTo(s2);
		if(ans<0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}