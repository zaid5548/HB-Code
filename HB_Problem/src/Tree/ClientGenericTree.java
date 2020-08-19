package Tree;

public class ClientGenericTree {

	public static void main(String[] args) {
		Generic_Tree gt=new Generic_Tree();
		gt.display();
//		System.out.println("Size of The Tree "+gt.size());
//		System.out.println("Height of the Tree "+gt.height());
//		System.out.println("Maximum value of in Tree is "+gt.max());
//		System.out.println("Value is present in Tree Or Not "+gt.find(10));
//		System.out.println("Mirror of Tree");
//		gt.mirror();
//		gt.display();
//		gt.PreOrder();
//		gt.PostOrder();
		gt.InOrder();
	}

}
