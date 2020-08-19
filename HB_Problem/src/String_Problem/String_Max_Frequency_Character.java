package String_Problem;

import java.util.Scanner;
import java.util.Set;

public class String_Max_Frequency_Character {

	private static int ASCII_SIZE=256;

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		System.out.println(MaxFrequencyCharacter(str));
	}

	private static char MaxFrequencyCharacter(String str) {
		int[] cnt=new int[ASCII_SIZE ];
		int len=str.length();
		for(int i=0;i<len;i++) {
			cnt[str.charAt(i)]++;
		}
		int max=Integer.MIN_VALUE;
		char ans=' ';
		for(int i=0;i<len;i++) {
			if(max<cnt[str.charAt(i)]) {
				max=cnt[str.charAt(i)];
				ans=str.charAt(i);
			}
		}
		
		return ans;
	}

}
