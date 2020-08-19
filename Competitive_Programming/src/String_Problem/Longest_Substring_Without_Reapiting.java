package String_Problem;

import java.util.HashSet;
import java.util.Scanner;

public class Longest_Substring_Without_Reapiting {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.nextLine();
//		int len=lengthOfLongestSubstring(str);
		int len=lengthOfLongestSubstring_2(str);
		System.out.println("Hello "+len);
	}

	private static int lengthOfLongestSubstring(String str) {
		int st=0, en=0, cl=0, ml=-1;
		HashSet<Character> hs=new HashSet<>();
		while(en<str.length()) {
			char ch=str.charAt(en);
			if(!hs.contains(ch)) {
				hs.add(ch);
				en++;
				cl=en-st;
			}else {
				if(ml<cl) {
					ml=cl;
					while(st<=en && en<str.length()) {
						if(str.charAt(st)!=str.charAt(en)) {
						hs.remove(str.charAt(st));
						st++;
						}else {
							st++;
							en++;
							break;
						}
					}
				}
			}
		}
		if(ml<cl)
			ml=cl;
		
		if(ml==-1)
			ml=str.length();
		
		return ml;
	}

	
	private static int lengthOfLongestSubstring_2(String str) {
		
		int i=0;
		int j=0;
		int max=0;
		HashSet<Character> hs=new HashSet<>();
		while(j<str.length()) {
			
			if(!hs.contains(str.charAt(j))) {
				hs.add(str.charAt(j));
				j++;
				max=Math.max(hs.size(), max);
			}else {
				hs.remove(str.charAt(i));
				i++;
			}
			
		}
		return max;
		
	}
}
