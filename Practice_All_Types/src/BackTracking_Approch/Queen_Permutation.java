package BackTracking_Approch;

public class Queen_Permutation {
	
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenprmt(new boolean[4], 0, 2, "");
	}
	
	public static void queenprmt(boolean[] Boxes,int qpsf,int tq,String ans)
	{
		
		if(qpsf==tq)
		{
			count++;
			System.out.println(count+". "+ans);
			return;
		}
		
		for(int i=0;i<Boxes.length;i++)
		{
			if(Boxes[i]==false)
			{
				Boxes[i]=true;
				queenprmt(Boxes, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ");
				Boxes[i]=false;
			}
		}
		
	}
}
