package Backtracking_Approach;

public class Path_Available_Or_Not {

	public static void main(String[] args) {
		int[][] arr= {{0,1,0,0},{0,0,0,0},{0,0,1,0},{0,1,0,0}};
		boolean[][] visited=new boolean[4][4];
		pathAvailable(arr, 0, 0, "",visited);
		

	}

	
	public static void pathAvailable(int[][] board,int row,int col,String ans,boolean[][] visited) {
		
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
		pathAvailable(board, row+1, col, ans+"D",visited);
		pathAvailable(board, row-1, col, ans+"U",visited);
		pathAvailable(board, row, col-1, ans+"L",visited);
		pathAvailable(board, row, col+1, ans+"R",visited);
		visited[row][col]=false;
	}


	
}
