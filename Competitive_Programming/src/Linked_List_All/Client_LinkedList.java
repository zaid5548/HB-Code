package Linked_List_All;

public class Client_LinkedList extends linked_List{

	public static void main(String[] args) throws Exception {
		linked_List ll=new linked_List();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.isEmpty());
//		System.out.println(ll.getAt(3));
//		ll.addAt(60, 3);
//		System.out.println("After Adding Element Getting index");
//		ll.display();
//		System.out.println("**************");
//		System.out.println(ll.removeFirst());
//		System.out.println(ll.removeLast());
//		System.out.println("Remove Getting Index "+ll.removeAt(4));
//		ll.reverseDataLinkedList();
//		System.out.println("Reverse LinkedList");
//		ll.display();
//		ll.reversePointerLinkedList();
//		ll.RPR();
		ll.fold();
		ll.display();
//		System.out.println("Mid of Given LinkedList "+ll.MidLinkedList());
	}

}
