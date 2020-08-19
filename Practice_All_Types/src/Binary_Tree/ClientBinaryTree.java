package Binary_Tree;


public class ClientBinaryTree {

	public static void main(String[] args) {
		
		String str="10 true 20 true 40 false false true 50 true 80 false false true 90 false false true 30 true 70 false false false ";
		BinaryTree bt=new BinaryTree(str);
		bt.display();
//		System.out.println("Size of Binary Tree  "+bt.size());
//		System.out.println("Maximum node  of Binary Tree  "+bt.max());
//		System.out.println("Item is present in Binary Tree  "+bt.find(90));
//		System.out.println("Height of Binary Tree  "+bt.height());
//		System.out.println("Given Tree is Balance or Not-->  "+bt.Balance());
//		System.out.println("Maximum Diameter in Given Tree-->  "+bt.Diameter());
//		System.out.println("PostOrder of Binary Tree");
//		bt.postorder();
//		System.out.println();
//		System.out.println("PreOrder of Binary Tree");
//		bt.preorder();
//		System.out.println();
//		System.out.println("inorder of Binary Tree");
//		bt.inorder();
//		System.out.println("Print binary tree in preorder using iterator mathod");
//		bt.preorderItr();
//		System.out.println("Print binary tree in postorder using iterator mathod");
//		bt.postorderItr();
//		System.out.println("Print binary tree in inorder using iterator mathod");
//		bt.inorderItr();
		System.out.println("*********");
		int[] a= {10,20,40,50,30,70};
		int[] b= {40,20,50,10,30,70};
		BinaryTree bt1=new BinaryTree(a,b);
		bt1.display();
	}

}
