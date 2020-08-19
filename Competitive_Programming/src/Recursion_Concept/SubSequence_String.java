package Recursion_Concept;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence_String {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		System.out.println(subsequence(str));

	}

	private static ArrayList<String> subsequence(String str) {
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=subsequence(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String val:rr) {
			mr.add(val);
			mr.add(ch+val);
			mr.add((int)ch+val); //with Ascii
		}
		return mr;
	}

}
