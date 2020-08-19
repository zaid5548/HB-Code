package String_Problem;

import java.util.Scanner;

public class Can_You_Read_This {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		ReadThis(str);
	}

	private static void ReadThis(String str) {
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i==0 && (int)ch>=65 && (int)ch<=90) {
				System.out.print(ch);
			}else if((int)ch>=97 && (int)ch<=122) {
				System.out.print(ch);
			}else {
				System.out.println();
				System.out.print(ch);
			}
		}
		
	}

}
