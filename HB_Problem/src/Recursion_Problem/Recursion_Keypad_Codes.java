package Recursion_Problem;

import java.util.Scanner;

public class Recursion_Keypad_Codes {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int t=keyPadCodes(str,"");
		System.out.println();
		System.out.println(t);
	}

	private static int keyPadCodes(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		int cnt=0;
		char ch=str.charAt(0);
		String ros=str.substring(1);
		String code=getCode(ch);
		for(int i=0;i<code.length();i++) {
			char ch1=code.charAt(i);
			cnt+=keyPadCodes(ros, ans+ch1);
		}
		return cnt;
	}

	private static String getCode(char ch) {
		
		if(ch=='1')
			return "abc";
		else if(ch=='2')
			return "def";
		else if(ch=='3')
			return "ghi";
		else if(ch=='4')
			return "jkl";
		else if(ch=='5')
			return "mno";
		else if(ch=='6')
			return "pqrs";
		else if(ch=='7')
			return "tuv";
		else if(ch=='8')
			return "wx";
		else if(ch=='9')
			return "yz";
		else
			return "";
	}

}
