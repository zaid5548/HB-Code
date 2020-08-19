package Recursion_Concept_printApproach;

public class MazePath_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mazepath(0, 0, 4, 2, "");
	}

	public static void mazepath(int cr,int cc,int er,int ec,String ans) {
		
		if(cr==er && cc==ec ) {
			System.out.print(ans+" ");
			return;
		}
		
		if(cr>er || cc>ec) {
			return;
		}
		
		mazepath(cr+1, cc, er, ec, ans+"V");
		mazepath(cr, cc+1, er, ec, ans+"H");
		
	}
	
}
