package Array_Practice;

import java.util.Scanner;

public class Sumof_Triplet {

	public static void main(String[] args) {

		 Scanner d=new Scanner(System.in);
	        int n=d.nextInt();
	        int[] array=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            array[i]=d.nextInt();
	        }
	        int target=d.nextInt();
	        sumpairs(array,target);
	    }
	    public static void sumpairs(int[] array,int target)
	    {
	        for(int i=0;i<=array.length/2;i++)
	        {
	            for(int j=i+1;j<array.length;j++)
	            {
	               for(int k=j+1;j<array.length;k++)
	               {
	                    int sum=array[i]+array[j]+array[k];
	                if(sum==target)
	                {
	                    System.out.println(Math.min(array[i], Math.min(array[j],array[k]))+","+Math.min(array[j],array[k])+"and"+" "+Math.max(array[j], array[k]));
	                }
	               }
	            }
	        }
	}

}
