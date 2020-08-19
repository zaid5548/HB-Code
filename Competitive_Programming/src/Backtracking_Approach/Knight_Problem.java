package Backtracking_Approach;

public class Knight_Problem {
	
	static int count=0;
	public static void main(String[] args) {
		
		boolean[][] board=new boolean[3][3];
		knightQueen(board, 0, 0, 0, board.length, "");
	}

	public static void knightQueen(boolean[][] board,int row,int col,int qpsf,int tq,String ans) {
		if(qpsf==tq) {
			System.out.println(++count+". "+ans);
			return;
		}
		
		if(col==board[0].length) {
			row++;
			col=0;
		}
		
		if(row==board.length) {
			return;
		}
		
		if(IsItPossible(board, row, col)) {
			board[row][col]=true;
			knightQueen(board, row, col+1, qpsf+1, tq, ans+"("+row+"-"+col+")");
			board[row][col]=false;
		}
		
		
		knightQueen(board, row, col+1, qpsf, tq, ans);
		
	}

	private static boolean IsItPossible(boolean[][] board, int row, int col) {

		int[] rowArr= {-1,-2,-2,-1};
		int[] colArr= {2,1,-1,-2};
		for(int i=0;i<4;i++) {
			int r=row+rowArr[i];
			int c=col+colArr[i];
			if(r>=0 && r<board.length && c>=0 && c<board[0].length) {
				if(board[r][c]) {
					return false;
				}
			}
		}
		
		
		return true;
	}
	
}
