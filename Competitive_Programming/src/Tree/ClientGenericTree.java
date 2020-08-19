package Tree;

public class ClientGenericTree {

	public static void main(String[] args) {
		Generic_Tree gt=new Generic_Tree();
		gt.display();
//		System.out.println("Size of this Tree "+gt.size());
//		System.out.println("Height of this Tree "+gt.height());
//		System.out.println("Maximum Value in this Tree "+gt.max());
//		System.out.println("Value is Present in this Tree Or Not -->  "+gt.findValue(510));
//		gt.mirror();
//		System.out.println("Mirror the tree");
//		gt.display();
//		System.out.println("PreOreder of Tree");
//		gt.PreOrder();
//		System.out.println("PostOreder of Tree");
//		gt.PostOrder();
//		System.out.println("Level Order print  node of Tree");
//		gt.printAtLevel(2);
//		System.out.println("Print all node of Tree LevelOrder Using Queue(LinkedList) BFS traversal");
//		gt.printLevelBFS();
//		gt.LevelOrderZZ();
		gt.linearize();
		System.out.println("Tree Print form of Linearize");
		gt.display();
	}

}
