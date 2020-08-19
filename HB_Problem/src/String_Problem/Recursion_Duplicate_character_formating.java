package String_Problem;

import java.util.Scanner;

public class Recursion_Duplicate_character_formating {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		DuplicataeFormating(str,0);
	}

	private static void DuplicataeFormating(String str,int ans) {
		if(str.length()-1==ans) {
			System.out.println(str);
			return;
		}
			
		if(str.charAt(ans)==str.charAt(ans+1)) {
			
			String temp=str.substring(0,ans+1);
			String ros=str.substring(ans+1);
			
			str=temp+"*"+ros;
			DuplicataeFormating(str, ans+2);
		}else {
			DuplicataeFormating(str, ans+1);
		}
		
	}

}
