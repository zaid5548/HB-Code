package Backtracking_Approach;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] box=new boolean[4];
		queenprmt(box, 0, 2, "");
	}

	public static void queenprmt(boolean[] box,int qpsf,int tq,String ans) {
		
		if(qpsf==tq) {
			System.out.print(ans+" ");
			return;
		}
		
		for(int i=0;i<box.length;i++) {
			if(box[i]==false) {
				box[i]=true;
				queenprmt(box, qpsf+1, tq, ans+"q"+qpsf+"b"+i);
				box[i]=false;
			}
			
		}
		
	}
	
}
