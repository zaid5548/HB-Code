package String_Problem;

import java.util.Scanner;

public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		DuplicataeFormating(str,0,"");
		
	}

	private static void DuplicataeFormating(String str,int ans,String res) {
		if(str.length()-1==ans) {
			System.out.println(res+str.charAt(str.length()-1));
			return;
		}
			
		if(str.charAt(ans)==str.charAt(ans+1)) {
			char ch=str.charAt(ans);

			DuplicataeFormating(str, ans+1, res);
			
		}else {
			char ch=str.charAt(ans);
			res+=ch;
			DuplicataeFormating(str, ans+1, res);
		}
		
	}

}
