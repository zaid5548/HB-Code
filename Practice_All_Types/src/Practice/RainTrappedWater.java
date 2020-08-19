package Practice;

import java.util.Scanner;

public class RainTrappedWater {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int tc=d.nextInt();
		while(tc>0)
		{
		int n=d.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=d.nextInt();
		}
		System.out.println(WaterTraped(arr));
		tc--;
		}
	}
	public static int WaterTraped(int[] arr)
	{
		int[] leftmax=new int[arr.length];
		int[] rightmax=new int[arr.length];
		leftmax[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			leftmax[i]=Math.max(leftmax[i-1], arr[i]);
		}
		rightmax[rightmax.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			rightmax[i]=Math.max(rightmax[i+1], arr[i]);
		}
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res+=Math.min(leftmax[i], rightmax[i])-arr[i];
		}
		return res;
	}

}
