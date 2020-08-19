package Simple_Concept;

import java.util.Scanner;

public class UpperCase_LowerCase {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				System.out.println("Character is LowerCase"+"With  "+(int)ch);
			}else if(ch>='A' && ch<='Z') {
				System.out.println("Character is UpperCase"+"With  "+(int)ch);
			}else {
				System.out.println("This is not a Character");
			}
		}
	}

}
