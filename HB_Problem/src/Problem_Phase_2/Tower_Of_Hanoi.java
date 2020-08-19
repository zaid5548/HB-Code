package Problem_Phase_2;

import java.util.Scanner;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		TowerOfHanoi(n,'A','B','C');

	}

	private static void TowerOfHanoi(int n,char src,char dest,char helper) {
		
//		Base Case
		if(n==0) {
			return;
		}
		
//		Recursion case
		TowerOfHanoi(n-1,src,helper,dest);
		
		System.out.println("Moving ring "+ n+ " from "+ src+ " to "+ dest);
		
		TowerOfHanoi(n-1, helper, dest, src);
	}

}
