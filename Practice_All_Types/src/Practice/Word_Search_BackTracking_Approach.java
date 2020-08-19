package Practice;

public class Word_Search_BackTracking_Approach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		char[][] board= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		int n=board.length;
		int m=board[0].length;
		String word="SEE";
		boolean ans=false;
		for(int row=0;row<board.length;row++)
		{
			for(int col=0;col<board[0].length;col++)
			{				
				if(board[row][col]==word.charAt(0))
				{
				ans=ans||WordSearch(board, row, col, word, new boolean[n][m],0);	
				}
			}
		}
		if(ans)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		long end=System.currentTimeMillis();
		long time=end-start;
		System.out.println("Total Time complexity in this code  ="+time);

	}
	
	public static boolean WordSearch(char[][] board,int row,int col,String word,boolean[][] visited,int vidx)
	{
		if(vidx==word.length())
		{
			return true;
		}
		
		if(row<0||col<0||row>=board.length||col>=board[0].length||visited[row][col])
		{
			return false;
		}
		
		if(board[row][col]!=word.charAt(vidx))
		{
			return false;
		}
		
		visited[row][col]=true;
		boolean up=WordSearch(board, row+1, col, word, visited,vidx+1);
		boolean down=WordSearch(board, row-1, col, word, visited,vidx+1);
		boolean left=WordSearch(board, row, col-1, word, visited,vidx+1);
		boolean right=WordSearch(board, row, col+1, word, visited,vidx+1);
		visited[row][col]=false;
		
		return up||down||left||right;
	}
	



}
