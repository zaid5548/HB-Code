package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericTree {

	Scanner scn=new Scanner(System.in);
	
	class Node{
		int data;
		ArrayList<Node> children=new ArrayList<>();
	}
	
	private Node root;
	
	public GenericTree() {
		System.out.println("hello tree programmer");
		root=Construct(null,0);
	}
	
	public Node Construct(Node parent,int ithc) {
		
		if(parent==null) {
			System.out.println("Enter the data for root Node? ");
		}else {
			System.out.println("Enter the data for"+ithc+"child? ");
		}
		
		Node nn=new Node();
		int item=scn.nextInt();
		nn.data=item;
		
		System.out.println("Enter the child of"+nn.data+"Node? ");
		int nc=scn.nextInt();
		
		for(int i=0;i<nc;i++) {
			Node child=Construct(nn, i);
			nn.children.add(child);
			
		}
		
		return nn;
		
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node node) {
		
		int s=0;
		for(Node child : node.children) {
			s=s+size(child);
		}
		return s+1;
	}
	
	public int height() {
		return height(root);
	}
	
	private int height(Node node) {
		
		int sh=-1;
		for(Node child:node.children) {
			
			int th=height(child);
			if(th>sh) {
				sh=th;
			}
		}
		
		return sh+1;
	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node node) {
		
		int m=Integer.MIN_VALUE;
		for(Node child: node.children) {
			
			int temp=max(child);
			if(temp>m) {
				m=temp;
			}
		}
		return m;
	}
	
	public boolean find(int item) {
		return find(root,item);
	}
	
	private boolean find(Node node,int item) {
		
		if(node.data==item) {
			return true;
		}
		for(Node child:node.children) {
			boolean rr=find(child, item);
			
			if(rr)
				return true;
		}
		return false;
	}
	
	public void mirror() {
		mirror(root);
	}
	
	private void mirror(Node node) {
		
		for(Node child:node.children) {
			mirror(child);
		}
		int i=0;
		int j=node.children.size()-1;
		
		while(i<j) {
			Node temp1 = node.children.get(i);
			Node temp2 = node.children.get(j);

			node.children.set(i, temp2);
			node.children.set(j, temp1);


			i++;
			j--;
		}
		
	}
	
	public void preorder() {
		preorder(root);
	}
	
	private void preorder(Node node) {
		
		System.out.print(node.data+" ");
		
		for(Node child:node.children) {
			preorder(child);
		}
		
	}
	
	public void postorder() {
		postorder(root);
	}
	
	private void postorder(Node node) {
		
		
		for(Node child:node.children) {
			postorder(child);
		}
		
		System.out.print(node.data+" ");
		
	}
	
	public void PrintAtLevel(int level) {
		PrintAtLevel(root, 0, level);
	}
	
	private void PrintAtLevel(Node node,int currlevel,int level) {
		
		if(currlevel==level) {
			System.out.print(node.data+" ");
			return;
		}
		
		for(Node child:node.children) {
			PrintAtLevel(child, currlevel+1,level);
		}
		
	}
	
	
	public void levelorder() {
		LinkedList<Node> q=new LinkedList<>();
		q.addLast(root);
		q.addLast(null);
		
		while(!q.isEmpty()) {
			
			Node rp=q.removeFirst();
			if(rp==null) {
				if(q.isEmpty()) {
					break;
				}
				System.out.println();
				q.addLast(null);
				continue;
			}
			
			System.out.print(rp.data+" ");
			
			for(Node child:rp.children) {
				q.addLast(child);
			}
		}
	}
	
	public void levelorder_2() {
		LinkedList<Node> q=new LinkedList<>();
		LinkedList<Node> h=new LinkedList<>();
		LinkedList<Node> temp=new LinkedList<>();
		q.addLast(root);
		while(!q.isEmpty()) {
			Node rp=q.removeFirst();
			System.out.print(rp.data+" ");
			for(Node child:rp.children) {
				h.addLast(child);
			}
			if(q.isEmpty()) {
				System.out.println();
				temp=h;
				h=q;
				q=temp;
			}
			
			
		}
	}
	
	public void zigzaglevelorder() {
		LinkedList<Node> q=new LinkedList<>();
		LinkedList<Node> h=new LinkedList<>();
		LinkedList<Node> temp=new LinkedList<>();
		int count=0;
		q.addLast(root);
		while(!q.isEmpty()) {
			
			Node rp=q.removeLast();
			System.out.print(rp.data+" ");
			if(count%2==0) {
			for(Node child:rp.children) {
				h.addLast(child);
			}
			}else {
				for(int i=rp.children.size()-1;i>=0;i--) {
					h.addLast(rp.children.get(i));
				}
			}
			if(q.isEmpty()) {
				count++;
				System.out.println();
				temp=h;
				h=q;
				q=temp;
			}
			
		}
	}
	
	
	public void display() {
		display(root);
	}
	public void display(Node node) {
		System.out.print(node.data + " -> ");
		for (Node child : node.children) {
			System.out.print(child.data + ", ");
		}
		if (node.children.size() == 0) {
			System.out.print(".");
		}
		System.out.println();
		for (Node child : node.children) {
			display(child);
		}
	}
	
}




// 10 3 20 3 50 2 80 0 90 0 60 1 100 0 70 1 110 1 120 1 130 0 30 1 140 0 40 1 150 2 160 0 170 0
