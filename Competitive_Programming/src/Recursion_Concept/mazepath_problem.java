package Recursion_Concept;

import java.util.ArrayList;

public class mazepath_problem {

	public static void main(String[] args) {
//		System.out.println(mazepath(0, 0, 4, 2));
//		System.out.println(mazepathDia(0, 0, 4, 2));
		System.out.println(mazepathMultiplePath(0, 0, 4, 2));

	}

	public static ArrayList<String> mazepath(int cr,int cc,int er,int ec){
		
		if(cr==er && cc==ec) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		
		ArrayList<String> mr=new ArrayList<>();

		if(cc+1<=ec) {
			ArrayList<String> rr2=mazepath(cr, cc+1, er, ec);
			
			for(String val:rr2) {
				mr.add("H"+val);
			}
		}
		
		if(cr+1<=er) {
			ArrayList<String> rr1=mazepath(cr+1, cc, er, ec);
			for(String val:rr1) {
				mr.add("V"+val);
			}
		}
		
		
		return mr;
	}



	
	public static ArrayList<String> mazepathDia(int cr,int cc,int er,int ec){
		
		if(cr==er && cc==ec) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		
		ArrayList<String> mr=new ArrayList<>();

		if(cc+1<=ec) {
			ArrayList<String> rr2=mazepathDia(cr, cc+1, er, ec);
			
			for(String val:rr2) {
				mr.add("H"+val);
			}
		}
		
		if(cr+1<=er && cc+1<=ec) {
			ArrayList<String> rr1=mazepathDia(cr+1, cc+1, er, ec);
			for(String val:rr1) {
				mr.add("D"+val);
			}
		}
		
		
		if(cr+1<=er) {
			ArrayList<String> rr1=mazepathDia(cr+1, cc, er, ec);
			for(String val:rr1) {
				mr.add("V"+val);
			}
		}
		
		
		return mr;
	}

	
	
	public static ArrayList<String> mazepathMultiplePath(int cr,int cc,int er,int ec){
		
		if(cr==er && cc==ec) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		
		if(cc>ec || cr>er) {
			ArrayList<String> br=new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr=new ArrayList<>();

		for(int i=1;i<=ec;i++) {
			
				ArrayList<String> rr2=mazepathMultiplePath(cr, cc+i, er, ec);
				
				for(String val:rr2) {
					mr.add("H"+i+val);
				}
			
			
		}
		
		
		
		for(int i=1;i<=er;i++) {
			
				ArrayList<String> rr1=mazepathMultiplePath(cr+i, cc, er, ec);
				for(String val:rr1) {
					mr.add("V"+i+val);
				}
			
		}
		
		
		
		return mr;
	}

}
