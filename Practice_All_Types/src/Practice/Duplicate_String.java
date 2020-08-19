package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_String {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		String str=d.nextLine();
		char[] ch=str.toCharArray();
		int n=ch.length;
		System.out.println(removeDuplicate(ch,n));
	}
	public static String removeDuplicate(char[] arr,int n)
	{
		int i,j,idx=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					break;
				}
			}	
		
		if(j==i)
		{
			arr[idx++]=arr[i];
		}
	   }
		return String.valueOf(Arrays.copyOf(arr, idx));
	}

}
