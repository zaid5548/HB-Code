package String_Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Smart_Keypad_1 {

	public static void main(String[] args) {
		String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		
		ArrayList<String> l1=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int n=Integer.parseInt(String.valueOf(ch));
			if(i==0) {
				
				for(int j=0;j<table[n].length();j++) {
					String st1=Character.toString(table[n].charAt(j));
					l1.add(st1);
				}
				
			}else {
				ArrayList<String> l2=new ArrayList<>();
				for(String st2:l1) {
					for(int k=0;k<table[n].length();k++){
						String st1=st2+table[n].charAt(k);
						l2.add(st1);
					}
				}
				l1=l2;
			}
		}
		for(String s:l1) {
			System.out.println(s);
		}
		
	}

	

}
