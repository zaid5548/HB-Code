package Recursion;

import java.util.ArrayList;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cointoss(3));
	}

	
	public static ArrayList<String> cointoss(int n)
	{
		if(n==0)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr=new ArrayList<>();
		
		ArrayList<String> toss=cointoss(n-1);
		for(String val:toss)
		{
			mr.add("H"+val);
			mr.add("T"+val);
		}
		return mr;
	}
}
