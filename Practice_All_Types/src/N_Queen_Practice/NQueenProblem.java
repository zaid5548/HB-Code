package N_Queen_Practice;

import Recursion.Board_Path;

public class NQueenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board=new boolean[4][4];
		NQueen(board, 0, 0, 0, board.length, "");
		
	}

	public static void NQueen(boolean[][] board,int row,int col,int qpsf,int tq,String ans)
	{
		if(qpsf==tq)
		{
			System.out.println(ans);
			return;
		}
		
		if(board[0].length==col)
		{
			row++;
			col=0;
		}
		
		if(row==board.length)
		{
			return;
		}
		
		if(IsItSafe(board,row,col))
		{
		
		board[row][col]=true;
		NQueen(board, row, col+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
		board[row][col]=false;
		}
		NQueen(board, row, col+1, qpsf, tq, ans);
		
		
		
		
	}

	private static boolean IsItSafe(boolean[][] board,int row, int col) {
		
		int r=row-1;
		int c=col;
		
		// UP 
		while(r>=0)
		{
			if(board[r][c])
			{
				return false;
			}
			r--;
		}
		
		// Left Side
		
		r=row;
		c=col-1;
		
		while(c>=0)
		{
			if(board[r][c])
			{
				return false;
			}
			c--;
		}
		
		// Dioganally Left
		
		r=row-1;
		c=col-1;
		
		while(r>=0 && c>=0)
		{
			if(board[r][c])
			{
				return false;
			}
			r--;
			c--;
		}
		
		// Dioganally Right
		
		r=row-1;
		c=col+1;
		
		while(r>=0 && c<board[0].length)
		{
			if(board[r][c])
			{
				return false;
			}
			r--;
			c++;
		}
		
		return true;
	}
	
}
