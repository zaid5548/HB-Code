package BackTracking_Approch;

import javax.swing.Box;

public class Queen_Combination {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queencomb(new boolean[4], 0, 2, "",-1);
	}
	
	public static void queencomb(boolean[] Boxes,int qpsf,int tq,String ans,int LastBoxUsed)
	{
		if(qpsf==tq)
		{
			count++;
			System.out.println(count+". "+ans);
		}
		
		for(int i=LastBoxUsed+1;i<Boxes.length;i++)
		{
				Boxes[i]=true;
				queencomb(Boxes, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ",i);
				Boxes[i]=false;
			
		}
		
	}
	
}
