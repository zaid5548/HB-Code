package String_Problem;

import java.util.Scanner;

public class String_String_Compression {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int count = 1;

		char last = str.charAt(0);

		StringBuilder output = new StringBuilder();

		for(int i = 1; i < str.length(); i++){
		    if(str.charAt(i) == last){
		    count++;
		    }else{
		        if(count > 1){
		            output.append(""+last+count);
		        }else{
		            output.append(last);
		        }
		    count = 1;
		    last = str.charAt(i);
		    }
		}
		if(count > 1){
		    output.append(""+last+count);
		}else{
		    output.append(last);
		}
		System.out.println(output.toString());
	}

}
