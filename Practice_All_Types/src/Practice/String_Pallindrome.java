package Practice;

import java.util.Scanner;

public class String_Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=scn.nextLine();
//		System.out.println(IsPallindrome(str));
		
		System.out.println(count_pal(str));
		long end=System.currentTimeMillis();
		long total=end-start;
		System.out.println("Total time complexity in this code --> "+total);
	}

	
	public static boolean IsPallindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static int count_pal(String str)
	{
		int res=0;
		for(int i=0;i<str.length();i++)
		{
			int center1=grow(str,i,i);
			int center2=grow(str,i,i+1);
			res+=center1+center2;
		}
		return res;
	}
	
	public static int grow(String str,int si,int ei)
	{
		int count=0;
		while(si>=0 && ei<str.length() && str.charAt(si)==str.charAt(ei))
		{
			count++;
			si--;
			ei++;
		}
		return count;
	}
}
