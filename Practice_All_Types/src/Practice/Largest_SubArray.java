package Practice;

import java.util.Scanner;

public class Largest_SubArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		int sum=0;
		int max_sum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			max_sum=Math.max(max_sum, sum);
			if(sum<0)
			{
				sum=0;
			}
		}
		System.out.println(max_sum);

	}

}
