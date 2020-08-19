package BackTracking_Approch;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		int n=board.length;
		int m=board[0].length;
		String word="SEE";
		boolean ans=false;
		for(int row=0;row<board.length;row++)
		{
			for(int col=0;col<=board[0].length;col++)
			{
				ans=ans||WordSearch(board, row, col, new boolean[n][m], word, 0);
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
	}
	
	
	public static boolean WordSearch(char[][] board,int row,int col,boolean[][] visited,String word,int vidx)
	{
		if(vidx==word.length())
		{
			return true;
		}
		
		if(row<0 || col<0 || row>=board.length || col>=board[0].length || visited[row][col])
		{
			return false;
		}
		
		if(board[row][col]!=word.charAt(vidx))
		{
			return false;
		}
		
		visited[row][col]=true;
		boolean down= WordSearch(board, row+1, col, visited, word, vidx+1);
		boolean up=WordSearch(board, row-1, col, visited, word, vidx+1);
		boolean left=WordSearch(board, row, col-1, visited, word, vidx+1);
		boolean right=WordSearch(board, row, col+1, visited, word, vidx+1);
		visited[row][col]=false;

		
		return down||up||left||right;
	}
}
