package Tree;

public class ClientGenericTree {

	public static void main(String[] args) {
		
		GenericTree gt=new GenericTree();
		gt.display();
//		System.out.println("Size of Tree-->   "+gt.size());
//		System.out.println("Height of Tree-->  "+gt.height());
//		System.out.println("Maximum value of Tree-->  "+gt.max());
//		System.out.println("item "+60+" is present-->  "+gt.find(60));
//		gt.mirror();
//		System.out.println("After Mirror Tree");
//		gt.display();
//		System.out.println("Preorder");
//		gt.preorder();
//		System.out.println("\nPostorder");
//		gt.postorder();
		System.out.println("Print Node At Level");
		gt.PrintAtLevel(3);
//		System.out.println("Level Order of tree");
//		gt.levelorder();
//		gt.levelorder_2();
//		gt.zigzaglevelorder();
		
	}

}
