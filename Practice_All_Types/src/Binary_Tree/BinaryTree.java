package Binary_Tree;

import java.util.Scanner;
import java.util.Stack;



public class BinaryTree {

	Scanner s;//=new Scanner(System.in);
	class Node{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BinaryTree(String str) {

		s = new Scanner(str);
		root = construct(null, false);
	}

	public Node construct(Node parent, boolean isLeftChild) {
		if (parent == null)
			System.out.println("Enter the Data of Root");
		else {
			if (isLeftChild == true) {
				System.out.println("Enter the Data for left child of " + parent.data);
			} else {
				System.out.println("Enter the Data for Right child of" + parent.data);
			}
		}

		int item = s.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println("is Left Child of" + nn.data);
		boolean b = s.nextBoolean();
		if (b) {
			nn.left = construct(nn, true);
		}

		System.out.println("is Right Child of" + nn.data);
		boolean c = s.nextBoolean();
		if (c) {

			nn.right = construct(nn, false);
		}
		return nn;
	}

	public int size() {
		return size(root);
	}
	
	public int size(Node node) {
		if(node==null) {
			return 0;
		}
		
		int ilc=size(node.left);
		int irc=size(node.right);
		
		return ilc+irc+1; 	
	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node node) {
		
		if(node==null) {
			return 0;
		}
		
		int leftmax=max(node.left);
		int rightmax=max(node.right);
		
		return Math.max(node.data, Math.max(leftmax,rightmax));
		
	}
	
	public boolean find(int item) {
		return find(root,item);
	}
	
	private boolean find(Node node,int item) {
		if(node==null) {
			return false;
		}
		if(node.data==item) {
			return true;
		}
		boolean left=find(node.left,item);
		boolean right=find(node.right, item);
		
		return left||right;
	}
	
	public int height() {
		return height(root);
	}
	
	private int height(Node node) {
		
		if(node==null) {
			return -1;
		}
		
		int leftheight=height(node.left);
		int rightheight=height(node.right);
		
		return Math.max(leftheight, rightheight)+1;
		
		
	}
	
	public boolean Balance() {
		return Balance(root);
	}
	
	private boolean Balance(Node node) {
		
		if(node==null) {
			return true;
		}
		
		boolean left=Balance(node.left);
		boolean right=Balance(node.right);
		
		int b=height(node.left)-height(node.right);
		
		return left && right && (b==0 || b==-1 || b==1)/*Math.abs(b) <= 1*/; 
		
	}
	
	public class balpair {
		int ht=0;
		boolean isb=true;
}
//	public balpair Balance_2() {
//		return Balance_2(root);
//	}
	
private balpair Balance_2(Node node) {
		
		if(node==null) {
			return new balpair();
		}
		
		balpair left=Balance_2(node.left);
		balpair right=Balance_2(node.right);
		
		balpair sp=new balpair();
		sp.ht=Math.max(left.ht, right.ht)+1;
		
		int bf=left.ht-right.ht;
		
		sp.isb= left.isb && right.isb && (bf==0 || bf==-1 || bf==1)/*Math.abs(b) <= 1*/; 
		
		return sp;
	}

	
	public int Diameter() {
		return Diameter(root);
	}
	
	private int Diameter(Node node) {
		
		if(node==null) {
			return 0;
		}
		
		int lans=Diameter(node.left);
		int rans=Diameter(node.right);
		int self=height(node.left) + height(node.right) + 2;
		
		return Math.max(self, Math.max(lans, rans));
		
	}
	
	public void postorder() {
		postorder(root);
	}
	public void postorder(Node node) {
		
		if(node==null) {
			return;
		}
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");	
	}
	
	public void preorder() {
		preorder(root);
	}
	public void preorder(Node node) {
		
		if(node==null) {
			return;
		}
		System.out.print(node.data+" ");	
		preorder(node.left);
		preorder(node.right);
	}
	
	public void inorder() {
		inorder(root);
	}
	public void inorder(Node node) {
		
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data+" ");	
		inorder(node.right);
	}
	
	
	
	
	
	public void display() {
		display(root);
	}
	
	private void display(Node node) {
		
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += "<--" + node.data + "-->";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}

		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	
	class pair {
		Node node;
		boolean sd;
		boolean rd;
		boolean ld;
	}
	
	
	
	public void preorderItr() {
		
		Stack<pair> s=new Stack<>();
		
		pair np=new pair();
		np.node=root;
		s.push(np);
		
		while(!s.isEmpty()) {
			
			pair rp=s.peek();
			
			if(rp.node==null) {
				s.pop();
				continue;
			}
			
			if(rp.sd==false) {
				System.out.print(rp.node.data+" ");
				rp.sd=true;
			}
			else if(rp.ld==false) {
				pair temp=new pair();
				temp.node=rp.node.left;
				s.push(temp);
				rp.ld=true;
			}
			else if(rp.rd==false) {
				pair temp=new pair();
				temp.node=rp.node.right;
				s.push(temp);
				rp.rd=true;
			}
			else {
				s.pop();
			}	
		}	
	}
	
	public void postorderItr() {
		Stack<pair> s=new Stack<>();
		pair np=new pair();
		np.node=root;
		s.push(np);
		
		while(!s.isEmpty()) {
			
			pair rp=s.peek();
			if(rp.node==null) {
				s.pop();
				continue;
			}
			
			if(rp.ld==false) {
				pair temp=new pair();
				temp.node=rp.node.left;
				s.push(temp);
				rp.ld=true;
			}
			else if(rp.rd==false) {
				pair temp=new pair();
				temp.node=rp.node.right;
				s.push(temp);
				rp.rd=true;
			}
			else if(rp.sd==false) {
				System.out.print(rp.node.data+" ");
				rp.sd=true;
			}else {
				s.pop();
			}
			
		}
		
	}
	
	public void inorderItr() {
		Stack<pair> s=new Stack<>();
		pair np=new pair();
		np.node=root;
		s.push(np);
		
		while(!s.isEmpty()) {
			pair rp=s.peek();
			if(rp.node==null) {
				s.pop();
				continue;
			}
			
			if(rp.ld==false) {
				pair temp=new pair();
				temp.node=rp.node.left;
				s.push(temp);
				rp.ld=true;
			}
			else if(rp.sd==false) {
				System.out.print(rp.node.data+" ");
				rp.sd=true;
			}
			else if(rp.rd==false) {
				pair temp=new pair();
				temp.node=rp.node.right;
				s.push(temp);
				rp.rd=true;
			}
			else {
				s.pop();
			}
				
		}
	}
	
	public BinaryTree(int[] pre, int[] in) {
		root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}
	
	public Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (plo > phi) {
			return null;
		}
		Node nn = new Node();
		nn.data = pre[plo];
		int idx = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (pre[plo] == in[i]) {
				idx = i;
				break;
			}
		}
		int nel = idx - ilo;
		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, idx - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, idx + 1, ihi);
		return nn;
	}
}

// 10 true 20 true 40 false false true 50 false false true 30 false true 60 false false