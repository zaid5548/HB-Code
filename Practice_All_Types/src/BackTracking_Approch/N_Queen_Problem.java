package BackTracking_Approch;

public class N_Queen_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board=new boolean[4][4];
//		NQueen(board, 0, 0, 0, board.length, "");
//		NQueen_Effi(board, 0, 0, 4, "");
	}
	
	
	public static void NQueen(boolean[][] board,int row,int col,int qpsf,int tq,String ans)
	{
		if(qpsf==tq)
		{
			System.out.println(ans);
			return;
		}
		
		if(col==board[0].length)
		{
			row++;
			col=0;
		}
		
		if(row==board.length)
		{
			return;
		}
		if(IsItSafe(board, row, col))
		{
		board[row][col]=true;
		
		NQueen(board, row, col+1, qpsf+1,tq, ans+"{"+row+"-"+col+"}");
		 board[row][col]=false;
		}
		
		 NQueen(board, row, col+1, qpsf, tq, ans);
		
	}
	
	public static boolean IsItSafe(boolean[][] board,int row,int col)
	{
		int r=row-1;
		int c=col;
		
		//Vertical Up
		while(r>=0)
		{
			if(board[r][c])
			{
				return false;
			}
			r--;
		}
		
		//Horizontal Left

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
		
		// Diognally Left
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
	
	public static void NQueen_Effi(boolean[][] board,int row,int qpsf,int tq,String ans)
	{
		if(qpsf==tq)
		{
			System.out.println(ans);
			return;
		}
		
		if(row==board.length)
		{
			return;
		}
		
		
		
		for(int col=0;col<board[0].length;col++)
		{
			if(IsItSafe(board, row, col))
			{
				board[row][col]=true;
				NQueen_Effi(board, row+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
				board[row][col]=false;
			}
			
		}
		
	}
	
	
	
	public static boolean IsItSafe2(boolean[][] board,int row,int col)
	{
		
		int[][] direction= {{-1,-2},{-2,-1},{-2,1},{-1,2}};
		
		for(int[] d:direction)
		{
			int r=row+d[0];
			int c=col+d[1];
			if(board[r][c])
			{
				return false;
			}
		}
		return true;
	}
	
}
