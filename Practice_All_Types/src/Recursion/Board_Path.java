package Recursion;

import java.util.ArrayList;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BoardPath(0, 10));
	}
	
	public static ArrayList<String> BoardPath(int cur,int end)
	{
		if(cur==end)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("\n");
			return br;
		}
		if(cur>end)
		{
			ArrayList<String> br=new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr=new ArrayList<>();
		for(int dice=1;dice<=6;dice++)
		{
			ArrayList<String> rr=BoardPath(cur+dice, end);
			
			for(String val:rr)
			{
				mr.add(dice+val);
			}
		}
		return mr;
	}
}
