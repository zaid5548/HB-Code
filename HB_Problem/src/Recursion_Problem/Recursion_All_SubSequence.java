package Recursion_Problem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Recursion_All_SubSequence {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			String str = sc.next();
			ArrayList<String> res = SubSequence(str);
			Collections.sort(res);  
			for(String ans:res)    
		    	System.out.println(ans);    
  
		}
	}

	public static ArrayList<String> SubSequence(String str) {
		if(str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = SubSequence(ros);
		for(int i = 0; i < rr.size(); i++) {
			mr.add(rr.get(i));
			mr.add(cc + rr.get(i));
		}
		return mr;	
    }
	
}
