package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Generic_Tree {

	Scanner scn=new Scanner(System.in);
	public class node{
		int data;
		ArrayList<node> children=new ArrayList<>();
	}
	private node root;
	public Generic_Tree() {
		root=construct(null,-1);
	}
	
	public node construct(node parent,int ithc) {
		
		if(parent==null) {
			System.out.println("Enter data for root node");
		}else {
			System.out.println("Enter child for "+ithc+" node");
		}
		
//		create node
		node nn=new node();
		int item=scn.nextInt();
		nn.data=item;
		
//		Enter no of child
		System.out.println("Enter the data for child");
		int nc=scn.nextInt();
		
//		Work for children
		for(int i=0;i<nc;i++) {
			node child=construct(nn, i);
			nn.children.add(child);
		}
		return nn;
	}
	
	public int size() {
		int ans=size(root);
		return ans;
	}
	private int size(node nn) {
		
		int s=0;
		for(node child:nn.children) {
			s=s+size(child);
		}
		return s+1;
		
	}
	
	public int height() {
		int ans=height(root);
		return ans;
	}
	private int height(node nn) {
		
		int h=-1;
		for(node child:nn.children) {
			int th=height(child);
			h=Math.max(h, th);
		}
		return h+1;
		
	}
	
	public int max() {
		int ans=max(root);
		return ans;
	}
	private int max(node nn) {
		int m=nn.data;
		
		for(node child:nn.children) {
			int tm=max(child);
			m=Math.max(m, tm);
		}
		return m;
	}
	
	public boolean find(int item) {
		boolean ans=find(root,item);
		return ans;
	}
	
	private boolean find(node nn,int item) {
		
		if(nn.data==item) {
			return true;
		}
		
		for(node child:nn.children) {
			boolean rr=find(child,item);
			if(rr) {
				return true;
			}
		}
		return false;
		
	}
	
	public void display() {
		display(root);
	}
	
	public void mirror() {
		mirror(root);
	}
	private void mirror(node nn) {
		
		for(node child:nn.children) {
			mirror(child);
		}
		
		int i=0;
		int j=nn.children.size()-1;
		while(i<j) {
			
			node temp=nn.children.get(i);
			nn.children.set(i, nn.children.get(j));
			nn.children.set(j, temp);
			i++;
			j--;
			
		}
		
	}
	
	public void PreOrder() {
		PreOrder(root);
	}
	private void PreOrder(node nn) {
		System.out.print(nn.data+" ");
		for(node child:nn.children) {
			PreOrder(child);
		}
	}
	
	public void PostOrder() {
		PostOrder(root);
	}
	private void PostOrder(node nn) {
	
		for(node child:nn.children) {
			PostOrder(child);
		}
		System.out.print(nn.data+" ");
	}
	
	
	private void display(node nn) {
		System.out.print(nn.data+"--> ");
		if(nn.children.size()==0) {
			System.out.print(".");
		}
		for(node child:nn.children) {
			System.out.print(child.data+", ");
		}
		System.out.println();
		for(node child:nn.children) {
			display(child);
		}
		
		
	}
	
}

//10 3 20 2 50 0 60 0 30 0 40 0
