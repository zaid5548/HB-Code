package Stack_Queue;

import java.util.Scanner;

public class Client_LinkedList {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addFirst(40);
		ll.display();
		System.out.println("********");
		System.out.println("Get first Element "+ll.getFirst());
		System.out.println("Get last Element "+ll.getLast());
		System.out.println("Size of LinkedList "+ll.size());
		System.out.println("Linked List is Empty "+ll.isEmpty());
		ll.addAt(50, 2);
		System.out.println();
		ll.display();
//		System.out.println("Size of LinkedList "+ll.size());
//		System.out.println();
//		System.out.println("Enter the index to get in LinkedList");
//		int n=scn.nextInt();
//		System.out.println("get Item At "+n+" Index "+ll.getAt(n));
//		System.out.println("get node t "+n+" index "+ll.getNodeAt(n));
//		System.out.println("\n"+"Remove the first element "+ll.removeFirst());
//		ll.display();
//		System.out.println("\n"+"Remove the element at last Index"+ll.removeLast());
//		ll.display();
		System.out.println("\n"+"Remove the elemnet at given index "+ll.removeAt(3));
		ll.display();
		
		
	}

}
