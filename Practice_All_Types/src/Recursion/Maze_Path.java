package Recursion;

import java.util.ArrayList;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(mazepath(0, 0, 4, 2));
//		System.out.println(mazepathAllPath(0, 0, 4, 2));
		System.out.println(mazepathMultiplePath(0, 0, 4, 2));
	}
	
	public static ArrayList<String> mazepath(int cr,int cc,int er, int ec)
	{
		
		if(cr==er && cc==ec)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add(" ");
			return br;
		}
		
		ArrayList<String> mr=new ArrayList<>();
		if(cc+1<=ec)
		{
		ArrayList<String> rrH=mazepath(cr, cc+1, er, ec);
		for(String val:rrH)
		{
			mr.add("H"+val);
		}
		}
		if(cr+1<=er)
		{
		ArrayList<String> rrV=mazepath(cr+1, cc, er, ec);		
		for(String val:rrV)
		{
			mr.add("V"+val);
		}
		}
		return mr;	
	}
	
	public static ArrayList<String> mazepathAllPath(int cr,int cc,int er, int ec)
	{
		
		if(cr==er && cc==ec)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add(" ");
			return br;
		}
		
		ArrayList<String> mr=new ArrayList<>();
		if(cc+1<=ec)
		{
		ArrayList<String> rrH=mazepathAllPath(cr, cc+1, er, ec);
		for(String val:rrH)
		{
			mr.add("H"+val);
		}
		}
		if(cr+1<=er)
		{
		ArrayList<String> rrV=mazepathAllPath(cr+1, cc, er, ec);		
		for(String val:rrV)
		{
			mr.add("V"+val);
		}
		}
		if(cc<=ec&&cr+1<=er)
		{
		ArrayList<String> rrD=mazepathAllPath(cr+1, cc+1, er, ec);		
		for(String val:rrD)
		{
			mr.add("D"+val);
		}
		}
		return mr;	
	}

	public static ArrayList<String> mazepathMultiplePath(int cr,int cc,int er, int ec)
	{
		
		if(cr==er && cc==ec)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add(" ");
			return br;
		}
		
		if(cc>ec || cr>er)
		{
			ArrayList<String> br=new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr=new ArrayList<>();
		for(int m=1;m<=ec;m++)
		{
		ArrayList<String> rrH=mazepathMultiplePath(cr, cc+m, er, ec);
		for(String val:rrH)
		{
			mr.add("H"+val);
		}
		}
		for(int m=1;m<=er;m++)
		{
		ArrayList<String> rrV=mazepathMultiplePath(cr+m, cc, er, ec);		
		for(String val:rrV)
		{
			mr.add("V"+val);
		}
		}
		for(int m=1;m<=ec&&m<=er;m++)
		{
		ArrayList<String> rrD=mazepathMultiplePath(cr+m, cc+m, er, ec);		
		for(String val:rrD)
		{
			mr.add("D"+val);
		}
		}
		return mr;	
	}



}
