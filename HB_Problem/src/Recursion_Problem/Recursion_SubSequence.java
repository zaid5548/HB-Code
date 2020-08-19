package Recursion_Problem;

import java.util.Scanner;

public class Recursion_SubSequence {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int t=subSequence(str,"");
		System.out.println();
		System.out.println(t);
	}

	private static int subSequence(String str, String ans) {
		
		if(str.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		int cnt=0;
		char ch=str.charAt(0);
		String ros=str.substring(1);
		
		cnt+=subSequence(ros, ans);
		cnt+=subSequence(ros, ans+ch);
		
		return cnt;
	}

}
