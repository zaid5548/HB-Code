package Practice;

import java.util.Scanner;

public class FormMinimumNumber {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		for(int k=0;k<n;k++)
		{
        String str=d.next();
        int[] arr=new int[str.length()+1];
        int count=1;
        for(int i=0;i<=str.length();i++)
        {
        	if(i==str.length() || str.charAt(i)=='I')
        	{
        		arr[i]=count++;
        	for(int j=i-1;j>=0 &&str.charAt(j)!='I';j--)
        	{
        		arr[j]=count++;
        	}
        	}
        }
        for(int val:arr)
        {
        	System.out.print(val);
        }
        System.out.println();
	}
	}

}
