package Backtracking_Approach;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		boolean[][] visited=new boolean[board.length][board[0].length];
		String str="SEE";
		boolean ans=false;
		for(int row=0;row<board.length;row++) {
			for(int col=0;col<board[0].length;col++) {
				if(board[row][col]==str.charAt(0)) {
				ans=ans || word_Search(board, row, col, str, visited, 0);
				}
			}
		}
		if(ans) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	public static boolean word_Search(char[][] board,int row,int col,String str,boolean[][] visited,int vidx) {
		
		if(vidx==str.length()) {
			return true;
		}
		
		if(row<0 || row>=board.length || col<0 || col>=board[0].length || visited[row][col])
		{
			return false;
		}
		
		if(board[row][col]!=str.charAt(vidx)) {
			return false;
		}
		
		visited[row][col]=true;
		boolean down=word_Search(board, row+1, col, str, visited, vidx+1);
		boolean up=word_Search(board, row-1, col, str, visited, vidx+1);
		boolean left=word_Search(board, row, col-1, str, visited, vidx+1);
		boolean right=word_Search(board, row, col+1, str, visited, vidx+1);
		visited[row][col]=false;
		
		return down || up || left || right;
		
	}
	
}
