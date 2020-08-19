package String_Problem;

import java.util.Scanner;

public class Max_Digit_Frequency {
	
	private static int ASCII_SIZE=256;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		String str="";
		str+=n;
		char ans=countDigit(str);
		System.out.println(ans);
	}

	private static char countDigit(String str) {
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
