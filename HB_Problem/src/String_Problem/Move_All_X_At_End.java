package String_Problem;

import java.util.Scanner;

public class Move_All_X_At_End {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		moveXToEnd(str,0,str.length());

	}

	private static void moveXToEnd(String str,int cnt,int len) {
		if(cnt>=len)
			return;
		
		char ch=str.charAt(cnt);
		if(ch!='x')
			System.out.print(ch);
		
		moveXToEnd(str, cnt+1, len);
		
		if(ch=='x')
			System.out.print(ch);
	}

}
