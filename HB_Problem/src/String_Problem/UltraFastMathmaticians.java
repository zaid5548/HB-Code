package String_Problem;

import java.util.Scanner;

public class UltraFastMathmaticians {

	 public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int test = sc.nextInt();
			while(test-- >0) {
				String str1 = sc.next();
				String str2 = sc.next();
				String str3 = "";
				for(int i = 0; i < str1.length(); i++){
					if(str1.charAt(i) == str2.charAt(i)) {
						str3 = str3 + "0";
					} else {
						str3 = str3 + "1";
					}
				}
				System.out.println(str3);
			}

	    }

}
