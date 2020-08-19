package String_Problem;

import java.util.Scanner;

public class Move_All_X_at_End {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		moveallX(str,0,str.length());

	}
//	axbxcaxbxcaxbxcaxbxc
	private static void moveallX(String str,int i,int l) {
		if(i>=l) {
			return;
		}
		char ch=str.charAt(i);
		
		if(ch!='x') {
			System.out.print(ch);
		}
		
		moveallX(str, i+1, l);
		
		if(ch=='x') {
			System.out.print(ch);
		}
	}

}
