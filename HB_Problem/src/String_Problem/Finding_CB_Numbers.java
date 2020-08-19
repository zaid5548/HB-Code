package String_Problem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String str=scn.nextLine();
		util(str,n);
	}

	private static void util(String s, int len) {
		ArrayList<Integer> visited=new ArrayList<>();
		int count = 0;
		for(int l =1; l <= len; l++) // len loop gives the length of substring
		{
			for(int start = 0; start <= len - l; start++)
			{
				int end = start + l;
				String sub = s.substring(start, l);
		
				if(isCBNumber(Long.parseLong(sub)) && isvalid(visited, start, end))
				{
					count++;
					
//					for(int i=start; i<end; i++)
//						visited[i] = 1;
					visited.add(1);
				}
			}
		}
	}
	
	static boolean isCBNumber(long num)
	{
		if(num==0 || num==1)
			return false;
		int ref[] = {2,3,5,7,11,13,17,19,23,29};
		for(int i=0; i<10; i++)
		{
			if(num-ref[i] == 0)
				return true;
		}
		for(int i=0; i<10; i++)
		{
			if(num%ref[i] == 0)
				return false;
		}
		return true;
	}
	
	static boolean isvalid(ArrayList<Integer> visited, int start, int end)
	{
		for(int i=start; i<end; i++)
		{
//			if(visited[i])
			if(visited.contains(i))
				return false;
		}
		return true;
	}

}
