package String_Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class try_1 {
    public static void main(String args[]) {
		String[] code = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		ArrayList<String> list1 = new ArrayList<>();
		for(int i = 0; i < input.length(); i++) {
			char cc = input.charAt(i);
			int num = Integer.parseInt(String.valueOf(cc)); 
			if(i == 0) {
				for(int j = 0; j < code[num].length(); j++) {
					String str1 = Character.toString(code[num].charAt(j));
				    list1.add(str1);
				}
			} else {
				ArrayList<String> list2 = new ArrayList<>();
				for(String str2:list1) {
					for(int k = 0; k < code[num].length(); k++) {
						String str1 = str2 + code[num].charAt(k);
						list2.add(str1);
					}
				}
				list1 = list2;
			}
			
			
		}
		for(String str:list1) 
			System.out.println(str);
    }
}
