package String_Problem;

import java.util.Scanner;

public class String_Difference_in_Ascii_Codes {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		stringDifference(str,"");
	}

	private static void stringDifference(String str,String ans) {
		char ch2=str.charAt(str.length()-1);
		for(int i=0;i<str.length()-1;i++) {
			char ch1=str.charAt(i);
			ans+=ch1;
			int d=(int)str.charAt(i+1)-(int)str.charAt(i);
			ans+=d;
			
		}
		ans+=ch2;
		System.out.println(ans);
	}

}
