package Recursion_Concept_printApproach;

public class Permutation_Prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("abc", "");
	}

	public static void permutation(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String ros=ques.substring(0,i)+ques.substring(i+1);
			permutation(ros, ans+ch);
		}
		
		
	}
	
}
