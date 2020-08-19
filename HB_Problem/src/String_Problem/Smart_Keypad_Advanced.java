package String_Problem;

import java.util.Scanner;

public class Smart_Keypad_Advanced {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String srch [] = {
	            "prateek", "sneha", "deepak", "arnav", "shikha", "palak",
	            "utkarsh", "divyam", "vidhi", "sparsh", "akku"
	    };
		keyPadCodes(str,"",srch);
	}

	private static void keyPadCodes(String str, String ans, String[] srch) {
		
		if(str.length()==0) {
			for(int i=0;i<srch.length;i++) {
				String res=srch[i];
				if(res.contains(ans)) {
					System.out.println(res);
				}
			}
			return;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		String code=getCode(ch);
		
		for(int i=0;i<code.length();i++) {
			char ch1=code.charAt(i);
			keyPadCodes(ros, ans+ch1, srch);
		}
		return;
		
	}
	
private static String getCode(char ch) {
		
		if(ch=='1')
			return "abc";
		else if(ch=='2')
			return "def";
		else if(ch=='3')
			return "def";
		else if(ch=='4')
			return "ghi";
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
