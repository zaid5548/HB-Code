package Tree;

import java.util.Scanner;

public class Binary_Tree {

	public class node{
		int data;
		node left;
		node right;
	}
	private node root;
	Scanner scn=new Scanner(System.in);
	
	public Binary_Tree() {
		root=construct(null,false);
	}
	
	private node construct(node parent,boolean isLeft) {
		
		if(parent==null) {
			System.out.println("Enter the data for root node");
		}else {
			if(isLeft) {
				System.out.println("Enter the data for Left child "+parent.data+" ? ");
			}else {
				System.out.println("Enter the data for Right child "+parent.data+" ? ");
			}
		}
		
		node nn=new node();
		int item=scn.nextInt();
		nn.data=item;
		
//		left
		System.out.println("is left child of "+nn.data+" ? ");
		boolean lc=scn.nextBoolean();
		if(lc) {
			nn.left=construct(nn, true);
		}
		
//		right
		System.out.println("is right child of "+nn.data+" ? ");
		boolean rc=scn.nextBoolean();
		if(rc) {
			nn.right=construct(nn, false);
		}
		
		return nn;
		
	}
	
	public void display() {
		display(root);
	}
	
	private void display(node nn) {
		if(nn==null) {
			return;
		}
		String str="";
		if(nn.left!=null) {
			str+=nn.left.data;
		}else {
			str+=".";
		}
		
		str+="--"+nn.data+"--";
		
		if(nn.right!=null) {
			str+=nn.right.data;
		}else {
			str+=".";
		}
		
		System.out.println(str);
		display(nn.left);
		display(nn.right);
	}
	
	
}
