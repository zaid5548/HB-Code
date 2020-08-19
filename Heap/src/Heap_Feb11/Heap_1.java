package Heap_Feb11;

import java.util.ArrayList;

public class Heap_1 {
	
	private ArrayList<Integer> data=new ArrayList<>();
	public void add(int item)
	{
		
		data.add(item);
		int ci=data.size()-1;
		upheapify(ci);
	}
	public void upheapify(int ci)
	{
		int pi=(ci-1)/2;
		if(data.get(ci)<data.get(pi))
		{
			swap(ci,pi);
			//add(pi);
			upheapify(pi);
		}
	}
		public void swap(int i,int j)
		{
			int ith=data.get(i);
			int jth=data.get(j);
			
			data.set(i, jth);
			data.set(j, ith);
		}
		public int remove()
		{
			swap(0,data.size()-1);
			int rv=data.remove(data.size()-1);
			downheapify(0);
			return rv;
		}
		public void downheapify(int pi)
		{
			int mini=pi;
			int lci=2*pi+1;
			int rci=2*pi+2;
			if(lci<data.size() && data.get(lci)<data.get(mini))
			{
				mini=lci;
			}
			if(rci<data.size() && data.get(rci)<data.get(mini))
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
		public int getMin()
		{
			return data.get(0);
		}
	public void display()
	{
		System.out.println(data);
	}
}
