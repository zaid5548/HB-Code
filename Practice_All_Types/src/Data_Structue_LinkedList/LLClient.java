package Data_Structue_LinkedList;

public class LLClient {

	public static void main(String[] args) throws Exception {

		LinkedList ll=new LinkedList();
		
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.addLast(60);
		ll.addLast(70);
		ll.addLast(80);		
		ll.display();
//		System.out.println();
//		System.out.println("First LinkedList Element is  "+ll.getFirst());
//		System.out.println("Last LinkedList Element is  "+ll.getFirst());
//		System.out.println("Get element"+" "+2+" "+"index  "+ll.getAt(2));
//		System.out.println(ll.getNodeAt(2));
//		ll.getAddAt(100, 8);
//		ll.display();
//		System.out.println("***********");
//		System.out.println(ll.removeFirst());
//		System.out.println("///*****************/////////");
//		System.out.println("Remove Last Element is "+ll.removeLast());
//		ll.display();
//		System.out.println("=======**********////////------------*******==========");
//		System.out.println(ll.removeAt(5));
//		ll.display();
//		System.out.println();
//		ll.RDI();
//		ll.display();
//		System.out.println("+++++++");
//		ll.RPI();
//		ll.display();
//		System.out.println("*******");
//		ll.RPR();
//		ll.display();
		
		ll.fold();
		System.out.println("\nAfter folding my given linkedlist");
		ll.display();
	}

}
























