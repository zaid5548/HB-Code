package String_Problem;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		char ch=str.charAt(0);
		int cnt=1;
		StringBuilder output=new StringBuilder();
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				cnt++;
			}else {
				if(cnt>0) {
					output.append(""+ch+cnt);
				}else {
					output.append(ch);
				}
				cnt=1;
				ch=str.charAt(i);
			}
		}
		if(cnt>0) {
			output.append(""+ch+cnt);
		}else {
			output.append(ch);
		}
		System.out.println(output.toString());
	}

}
