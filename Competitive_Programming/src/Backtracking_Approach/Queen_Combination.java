package Backtracking_Approach;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean[] box=new boolean[4];
//		queencmb(box, 0, 2, "",-1);
		boolean[][] board=new boolean[3][3];
//		QueenCombination_Boxrespect(board, 0, 0, 2, "");
		QueenCombination_2D(board, 0, 0, 0, 2, "");
		
	}

	public static void queencmb(boolean[] box,int qpsf,int tq,String ans,int LastIndex) {
		
		if(qpsf==tq) {
			System.out.print(ans+" ");
			return;
		}
		
		for(int i=LastIndex+1;i<box.length;i++) {
			
			if(box[i]==false) {
				box[i]=true;
				queencmb(box, qpsf+1, tq, ans+"q"+qpsf+"b"+i,i);
				box[i]=false;
			}
			
		}
		
		
	}
	
	
	public static void QueenCombination_Boxrespect(boolean[] board,int col,int qpsf,int tq,String ans){
		if(qpsf==tq) {
			System.out.print(ans+" ");
			return;
		}
		if(col>=board.length) {
			return;
		}
		
		board[col]=true;
		QueenCombination_Boxrespect(board, col+1, qpsf+1, tq, ans+"b"+col);
		board[col]=false;
		
		QueenCombination_Boxrespect(board, col+1, qpsf, tq, ans);
	}

	
	public static void QueenCombination_2D(boolean[][] board,int row,int col,int qpsf,int tq,String ans) {
		
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		
		if(col==board[0].length) {
			col=0;
			row=row+1;
		}
		
		if(row==board.length) {
			return;
		}
		
		board[row][col]=true;
		QueenCombination_2D(board, row, col+1, qpsf+1, tq, ans+"("+row+"-"+col+")");
		board[row][col]=false;
		
		QueenCombination_2D(board, row, col+1, qpsf, tq, ans);
		
	}
}
