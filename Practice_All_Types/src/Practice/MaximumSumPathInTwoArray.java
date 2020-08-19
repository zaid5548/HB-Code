package Practice;

import java.util.Scanner;

public class MaximumSumPathInTwoArray {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		int m=d.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[m];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=d.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=d.nextInt();
		}
		Maximumpath(arr1,arr2);
	}
	public static void Maximumpath(int[] one,int[] two)
	{
		int s1=0,s2=0;
		int i=0,j=0;
		int rs=0;
		while(i<one.length && j<two.length)
		{
		if(one[i]<two[j])
		{
			s1+=one[i];
			i++;
		}
		else if(one[i]>two[j])
		{
			s2+=two[j];
			j++;
		}
		else
		{
			rs+=Math.max(s1, s2)+one[i];
			s1=0;
			s2=0;
			i++;
			j++;
		}
	}
	while(i<one.length)
	{
		rs+=one[i];
		i++;
	}
	while(j<two.length)
	{
		rs+=two[j];
		j++;
	}
	System.out.println(rs+" ");
  }
}