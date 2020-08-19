package BackTracking_Approch;

public class Queen_2D_Approach {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board=new boolean[3][3];
//		queen2d(board, 0, 0, 0, 2, "");
		queen2dRec(board, 0, 0, 0, 2, "");
	}
	
	
	public static void queen2d(boolean[][] board,int row,int col,int qpsf,int tq,String ans)
	{
		
		if(qpsf==tq)
		{
			count++;
			System.out.println(count+". "+ans);
			return;
		}
		
		if(col==board[0].length)
		{
			row++;
			col=0;
			
		}
		if(board.length==row)
		{
			return;
		}
	
		//Placed Queen
		board[row][col]=true;
		queen2d(board, row, col+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
		board[row][col]=false;
		
		//Not Placed Queen
		queen2d(board, row, col+1, qpsf, tq, ans);
	}
	
	public static void queen2dRec(boolean[][] board,int row,int col,int qpsf,int tq,String ans)
	{
		
		if(qpsf==tq)
		{
			count++;
			System.out.println(count+". "+ans);
			return;
		}
		
		if(col==board[0].length)
		{
			queen2d(board, row+1, 0, qpsf, tq, ans);
			return;
		}
		if(board.length==row)
		{
			return;
		}
		
		//Placed Queen
		board[row][col]=true;
		queen2dRec(board, row, col+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
		board[row][col]=false;
		
		//Not Placed Queen
		queen2dRec(board, row, col+1, qpsf, tq, ans);
	}
}
