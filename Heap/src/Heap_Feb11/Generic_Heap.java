package Heap_Feb11;

import java.util.ArrayList;

public class Generic_Heap<T extends Comparable<T>> {
	private ArrayList<T> data=new ArrayList<>();
	public void add(T item)
	{
		
		data.add(item);
		int ci=data.size()-1;
		upheapify(ci);
	}
	public void upheapify(int ci)
	{
		int pi=(ci-1)/2;
		if(data.get(ci).compareTo(data.get(pi))>0)
		{
			swap(ci,pi);
			//add(pi);
			upheapify(pi);
		}
	}
		public void swap(int i,int j)
		{
			T ith=data.get(i);
			T jth=data.get(j);
			
			data.set(i, jth);
			data.set(j, ith);
		}
		public T remove()
		{
			swap(0,data.size()-1);
			T rv=data.remove(data.size()-1);
			downheapify(0);
			return rv;
		}
		public void downheapify(int pi)
		{
			int mini=pi;
			int lci=2*pi+1;
			int rci=2*pi+2;
			if(lci<data.size() && data.get(lci).compareTo(data.get(mini))>0)
			{
				mini=lci;
			}
			if(rci<data.size() && data.get(rci).compareTo(data.get(mini))>0)
			{
				mini=rci;
			}
			if(mini!=pi)
			
			{
				swap(pi,mini);
				downheapify(mini);
			}
		}
		public boolean isEmpty()
		{
			if(data.size()==0)
				return true;
			else
				return false;
		}
		public T getMin()
		{
			return data.get(0);
		}
	public void display()
	{
		System.out.println(data);
	}

}
