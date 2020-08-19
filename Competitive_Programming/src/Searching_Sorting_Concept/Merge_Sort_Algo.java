package Searching_Sorting_Concept;

public class Merge_Sort_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,3,1,2};
		int[] ans=mergesort(arr, 0, arr.length-1);
		for(int val:ans) {
			System.out.print(val+" ");
		}
	}
	
	
	public static int[] mergesort(int[] arr,int lo,int hi) {
		
		if(lo==hi) {
			int[] br=new int[1];
			br[0]=arr[lo];
			return br;
		}
		
		int mid=(lo+hi)/2;
		
		int[] fh=mergesort(arr, lo, mid);
		int[] sh=mergesort(arr, mid+1, hi);
		
		int[] sort=MergeToSorted(fh,sh); 
		
		return sort;
		
	}


	private static int[] MergeToSorted(int[] one, int[] two) {
		
		int i=0;
		int j=0;
		int cnt=0;
		int[] res=new int[one.length+two.length];
		while(i<one.length && j<two.length) {
			
			if(one[i]<two[j]) {
				res[cnt]=one[i];
				i++;
				cnt++;
			}else {
				res[cnt]=two[j];
				j++;
				cnt++;
			}
			
		}
		
		while(i<one.length) {
			res[cnt]=one[i];
			i++;
			cnt++;
		}
		
		while(j<two.length) {
			res[cnt]=two[j];
			j++;
			cnt++;
		}
		
		
		
		return res;
	}

}
