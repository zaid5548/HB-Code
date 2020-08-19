package Recursion_Concept_printApproach;

public class BoardPath_Prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boardpath(0, 10, "");
	}

	public static void boardpath(int curr,int end,String ans) {
		
		if(curr==end) {
			System.out.println(ans);
			return;
		}
		
		if(curr>end) {
			return;
		}
			for(int i=1;i<=6;i++) {
				boardpath(curr+i, end, ans+i);
			}
		
		
		
		
	}
	
}
