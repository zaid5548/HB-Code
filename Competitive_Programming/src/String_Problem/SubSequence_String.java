package String_Problem;
import java.util.*;

public class SubSequence_String {

	    	public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
//			String s="zaid";
//			String s1=s.replace("z", "k");
//			System.out.println(s1);
	        String str=scn.nextLine();
			int x = Subseq(str,"");
	        System.out.println();
	        System.out.println(x);
	    }

		public static int Subseq(String ques, String ans) {
			if(ques.length()==0)
			{
				System.out.print(ans+" ");
				return 1;
			}
	        int x = 0;
			char ch=ques.charAt(0);
			String ros=ques.substring(1);
		
			x+= Subseq(ros, ans);
			x+= Subseq(ros, ans+ch);
	        return x;
		}
	
}
