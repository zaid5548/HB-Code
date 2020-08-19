package Problem_Phase_1;

import java.util.Scanner;

public class Replace_All_Pi {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>=0){
			String str=scn.nextLine();
			String str1=str.replace("pi","3.14");
			System.out.println(str1);
			t--;
		}
	}

}
