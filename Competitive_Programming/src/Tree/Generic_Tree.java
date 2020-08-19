package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
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
			System.out.println("Enter the data for Root node");
		}else {
			System.out.println("Enter the data for "+ithc+" child?");
		}
		
//		create node
		node nn=new node();
		int item=scn.nextInt();
		nn.data=item;
		
//		Enter the data of child
		System.out.println("Enter tha data of child");
		int nc=scn.nextInt();
		
//		work for children
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
	
	public boolean findValue(int value) {
		boolean ans=findValue(root,value);
		return ans;
	}
	
	private boolean findValue(node nn,int val) {
		
		if(nn.data==val) {
			return true;
		}
		
		for(node child:nn.children) {
			boolean rr=findValue(child,val);
			if(rr) {
				return true;
			}
		}
		
		return false;
		
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
	
	public void InOrder() {
		InOrder(root);
	}
	
	private void InOrder(node nn) {
		
		
		for(node child:nn.children) {
			System.out.print(nn.data+" ");
			InOrder(child);
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
	
	public void printAtLevel(int level) {
		printAtLevel(root,0,level);
	}
	private void printAtLevel(node nn,int currLevel,int level) {
		
		if(currLevel==level) {
			System.out.print(nn.data+" ");
			return;
		}
		
		for(node child:nn.children) {
			printAtLevel(child, currLevel+1, level);
		}
		
	}
	
	public void printLevelBFS() {
		LinkedList<node> q=new LinkedList<>();
		q.addLast(root);
		q.addLast(null);
		while(!q.isEmpty()) {
			node rp=q.removeFirst();
			if(rp==null) {
			if(q.isEmpty()) {
				break;
			}
			
		
				System.out.println();
				q.addLast(null);
				continue;
			}
			
			System.out.print(rp.data+" ");
			for(node child:rp.children) {
				q.addLast(child);
			}
		}
		
	}
	
	public void LevelOrderZZ() {
		
		LinkedList<node> q=new LinkedList<>();
		LinkedList<node> h=new LinkedList<>();
		q.addLast(root);
		int cnt=0;
//		q.addLast(null);
		while(!q.isEmpty()) {
			
			node rp=q.removeFirst();
			System.out.print(rp.data+" ");
			if(cnt%2==0) {
				for(node child:rp.children) {
					h.addFirst(child);
				}
			}else {
				for(int i=rp.children.size()-1;i>=0;i--) {
					h.addFirst(rp.children.get(i));
				}
			}
			if(q.isEmpty()) {
				System.out.println();
				q=h;
				h=new LinkedList<>();
				cnt++;
			}
			
		}
		
	}
	
	public void linearize() {
		linearize(root);
	}
	private void linearize(node nn) {
		for(node child:nn.children) {
			linearize(child);
		}
		
//		self work
		while(nn.children.size()>1) {
			
			node tail=getTail(nn.children.get(0));
			node child=nn.children.remove(1);
			
			tail.children.add(child);
			
		}
	}
	
	private node getTail(node nn) {
		
		if(nn.children.size()==0) {
			return nn;
		}
		
		return getTail(nn.children.get(0));
	}
	
	public void display() {
		display(root);
	}
	
	public void display(node nn) {
		
		System.out.print(nn.data+"-> ");
		
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
//10 3 20 2 50 0 60 1 80 0 30 0 40 1 70 1 90 0
// 10 3 20 2 50 0 60 0 30 0 40 0
