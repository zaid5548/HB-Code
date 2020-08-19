 package Practice;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,10,40,30};
		quicksort(arr, 0, arr.length-1);
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
		sum(1,2,3,4,5);
	}
	
	public static void quicksort(int[] arr,int lo,int hi)
	{
	
		if(lo>=hi)
		{
			return;
		}
		int mid=(lo+hi)/2;
		int pivot=arr[mid];
		int left=lo;
		int right=hi;
		while(left<=right)
		{
			while(arr[left]<pivot)
			{
				left++;
			}
			while(arr[right]>pivot)
			{
				right--;
			}
			if(left<=right)
			{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
			}
		}
		quicksort(arr, lo, right);
		quicksort(arr, left, hi);
	}

	//Method Overloading
	public static void sum(int... args)
	{
		System.out.println("-----------------");
		for(int val:args)
		{
			System.out.print(val+" ");
		}
	}
}
