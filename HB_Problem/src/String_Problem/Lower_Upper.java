package String_Problem;

import java.util.Scanner;

public class Lower_Upper {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		lowerUpper(ch);

	}

	private static void lowerUpper(char ch) {
		if((int)ch>=65 && (int)ch<=90) {
			System.out.println("UPPERCASE");
		}else if((int)ch>=97 && (int)ch<=122) {
			System.out.println("lowercase");
		}else {
			System.out.println("Invalid");
		}
		
	}

}
