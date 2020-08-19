package Recursion;

public class firstIndex {

	public static void main(String[] args) {
		int[] arr= {9,1,7,1,2,3,1,4,5};
		System.out.println(firstIndex(arr,0,4));
		System.out.println("*************");
		System.out.println(LastIndex(arr, 0, 8));
		System.out.println("****************");
		int[] ans=AllIndexes(arr, 0, 1, 0);
		for(int val:ans)
		{
			System.out.print(val+" ");
		}
	}
	public static int firstIndex(int[] arr,int vidx,int item)
	{
		if(vidx==arr.length)
		{
			return -1;
		}
		if(arr[vidx]==item)
		{
			return vidx;
		}
		int rr=firstIndex(arr, vidx+1, item);
		return rr;
	}
	
	public static int LastIndex(int[] arr,int vidx,int item)
	{
		if(vidx==arr.length)
		{
			return -1;
		}
		int rr=firstIndex(arr, vidx+1, item);
		if(arr[vidx]==item)
		{
			return vidx;
		}
		return rr;
	}

	public static int[] AllIndexes(int[] arr,int vidx,int item,int count)
	{
		if(vidx==arr.length)
		{
			int[] array=new int[count];
			return array;
		}
		
		if(arr[vidx]!=item)
		{
			int[] rr=AllIndexes(arr, vidx+1, item, count);
			return rr;
		}
		else
		{
			int[] sr=AllIndexes(arr, vidx+1, item, count+1);
			sr[count]=vidx;
			
			return sr;
		}
	}
	
}
