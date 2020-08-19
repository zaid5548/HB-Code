package Practice;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,3,12,34,33,11,34,21,2,4,3,2};
		int[] ans=mergesort(arr, 0, arr.length-1);
		for(int val:ans)
		{
			System.out.print(val+" ");
		}
	}
	
	
	public static int[] mergesort(int[] arr,int lo,int hi)
	{
		if(lo==hi)
		{
			int[] br=new int[1];
			br[0]=arr[lo];
			return br;
		}
		
		int mid=(hi+lo)/2;
		
		int[] fh=mergesort(arr, lo, mid);
		int[] sh=mergesort(arr, mid+1, hi);
		
		int[] result=MergeTwoSortedArray(fh,sh);
		
		return result;
	}
	
	public static int[] MergeTwoSortedArray(int[] one,int[] two)
	{
		int[] sorted=new int[one.length+two.length];
		int i=0;
		int k=0;
		int j=0;
		while(i<one.length && j<two.length)
		{
			if(one[i]<two[j])
			{
				sorted[k]=one[i];
				i++;
				k++;
			}
			else
			{
				sorted[k]=two[j];
				j++;
				k++;
			}
		}
		
		while(i<one.length)
		{
			sorted[k]=one[i];
			i++;
			k++;
		}
		while(j<two.length)
		{
			sorted[k]=two[j];
			j++;
			k++;
		}
		
		return sorted;
	}
}
