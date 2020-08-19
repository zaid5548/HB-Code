package Practice;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		while(tc>0)
		{
		int c1=scn.nextInt();
		int c2=scn.nextInt();
		int c3=scn.nextInt();
		int c4=scn.nextInt();
		int nr=scn.nextInt();
		int nc=scn.nextInt();
		int[] riksha=new int[nr];
		for(int i=0;i<nr;i++)
		{
			riksha[i]=scn.nextInt();
		}
		int[] cab=new int[nc];
		for(int i=0;i<nc;i++)
		{
			cab[i]=scn.nextInt();
		}
		
		int riksha_cost=calculate(riksha, c1, c2, c3);
		int cab_cost=calculate(cab, c1, c2, c3);
		int min_fare=riksha_cost+cab_cost;
		System.out.println();
		System.out.print(Math.min(min_fare, c4));
		tc--;
		}
	}
	public static int calculate(int[] arr,int c1,int c2, int c3)
	{
		int fare=0;
		for(int i=0;i<arr.length;i++)
		{
			fare+=Math.min(arr[i]*c1, c2);
		}
		return Math.min(fare, c3);
	}

}
