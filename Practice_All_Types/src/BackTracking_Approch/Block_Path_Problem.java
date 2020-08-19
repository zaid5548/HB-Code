package BackTracking_Approch;

public class Block_Path_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		boolean[][] board=new boolean[4][4];
		int[][] arr= {{0,1,0,0},{0,0,0,0},{0,0,1,0},{0,1,0,0}};
		BlockPathBoard(arr, 0, 0, "",board);
		long end=System.currentTimeMillis();
		long time=end-start;
		System.out.println("Total Time complexity in this code  ="+time);

	}
	
	public static void BlockPathBoard(int[][] board,int row,int col,String ans,boolean[][] visited)
	{
		if(row==board.length-1 && col==board[0].length-1)
		{
			System.out.println(ans);
			return;
		}
		
		if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]==1 ||visited[row][col]==true)
		{
			return;
		}
		
			visited[row][col]=true;
			//DownWard
			BlockPathBoard(board, row+1, col, ans+"D",visited);
			//Upward
			BlockPathBoard(board, row-1, col, ans+"U",visited);
			//Right
			BlockPathBoard(board, row, col+1, ans+"R",visited);
			//Left
			BlockPathBoard(board, row, col-1, ans+"L",visited);
			visited[row][col]=false;
	}
	
	public static boolean IsItSafe(boolean[][] board,int row,int col)
	{
		//DownWard
		int r=row+1;
		int c=col;
		while(r==board.length)
		{
			if(board[r][c])
			{
				return false;
			}
			r++;
		}
		
		// UpWard
		r=row-1;
		c=col;
		while(r>=0)
		{
			if(board[r][c])
			{
				return false;
			}
			r--;
		}
		
		//Right
		r=row;
		c=col+1;
		
		while(c<board[0].length)
		{
			if(board[r][c])
			{
				return false;
			}
			c++;
		}
		
		// Left
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
		
		return true;
	}
}
