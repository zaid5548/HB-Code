package String_Problem;

import java.util.Scanner;

public class Recursion_Convert_String_To_Integer {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		StringToInteger(str);
		
	}

	private static void StringToInteger(String str) {

			System.out.println(Integer.parseInt(str));

	}

}
