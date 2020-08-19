package String_Problem;

import java.util.Scanner;

public class Maximum_Occuring_Character {
	static final int ASCII_SIZE = 256; 
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		System.out.println(MaximumCharacter(str));

	}

	private static char MaximumCharacter(String str) {
		
		int[] cnt=new int[ASCII_SIZE ];
		
		int len=str.length();
		
		for(int i=0;i<len;i++) {
			cnt[str.charAt(i)]++;
		}
		
		int max=-1;
		char res=' ';
		 
		for(int i=0;i<len;i++) {
			if(max<cnt[str.charAt(i)]) {
				max=cnt[str.charAt(i)];
				res=str.charAt(i);
			}
		}
		return res;
	}

}
