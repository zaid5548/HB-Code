package Backtracking_Approach;

public class N_Queen_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board=new boolean[4][4];
		NQueen(board, 0, 0,0,board.length, "");
	}
	
	
	public static void NQueen(boolean[][] board,int row,int col,int qpsf,int tq,String ans) {
		
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		
		if(col==board[0].length) {
			row++;
			col=0;
		}
		
		if(row==board.length) {
			return;
		}
		
		if(IsItSafe(board, row, col)) {
			board[row][col]=true;
			NQueen(board, row, col+1, qpsf+1, tq, ans+"("+row+"-"+col+")");
			board[row][col]=false;
		}
		
		
		NQueen(board, row, col+1, qpsf, tq, ans);
	}
	
	public static boolean IsItSafe(boolean[][] board,int row,int col) {
		
		int r=row-1;
		int c=col;
		//up
		while(r>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
		}
		
		// Horigontle
		r=row;
		c=col-1;
		while(c>=0) {
			if(board[r][c]) {
				return false;
			}
			c--;
		}
		
		//Left Diagonal
		r=row-1;
		c=col-1;
		while(r>=0 && c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		
		//Right Diagonal
		r=row-1;
		c=col+1;
		
		while(r>=0 && c<board[0].length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		
		return true;
	}
	
}
