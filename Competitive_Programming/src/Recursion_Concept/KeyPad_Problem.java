package Recursion_Concept;

import java.util.ArrayList;

public class KeyPad_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(keypad("123"));
	}

	public static ArrayList<String> keypad(String str){
		
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=keypad(ros);
		String code=getCode(ch);
		ArrayList<String> mr=new ArrayList<>();
		for(int i=0;i<code.length();i++) {
			char temp=code.charAt(i);
			for(String val:rr) {
				mr.add(temp+val);
			}
		}
		return mr;
		
	}
	
	
	public static String getCode(char ch)
	{
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
			return "pqr";
		else if(ch=='7')
			return "stu";
		else if(ch=='8')
			return "vwx";
		else if(ch=='9')
			return "yz";
		else if(ch=='2')
			return "+";
		else
			return "";
	}

}
