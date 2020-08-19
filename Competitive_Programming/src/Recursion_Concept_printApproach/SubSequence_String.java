package Recursion_Concept_printApproach;

public class SubSequence_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		subsequnce("abc", "");
		subsequnceAscii("abc", "");
	}
	
	public static void subsequnce(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch=ques.charAt(0);
		String ros=ques.substring(1);
		subsequnce(ros, ans);
		subsequnce(ros, ans+ch);
		
	}
	
public static void subsequnceAscii(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch=ques.charAt(0);
		String ros=ques.substring(1);
		subsequnceAscii(ros, ans);
		subsequnceAscii(ros, ans+ch);
		subsequnceAscii(ros, ans+(int)ch);
		
	}

}
