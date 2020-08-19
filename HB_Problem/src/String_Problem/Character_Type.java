package String_Problem;

import java.util.Scanner;

public class Character_Type {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		Check(ch);
	}

	private static void Check(char ch) {
		
		if((int)ch>=65 && (int)ch<=90) {
			System.out.println("U");
		}else if((int)ch>=97 && (int)ch<=122) {
			System.out.println("L");
		}else {
			System.out.println(ch);
		}
		
	}

}
