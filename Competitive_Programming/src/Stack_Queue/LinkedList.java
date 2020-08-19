package Stack_Queue;

public class LinkedList {
	
	class node{
		int val;
		node next;
	}
	private node head;
	private node tail;
	private int size;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addLast(int item) {
		
		node nn=new node();
		nn.val=item;
		
		if(isEmpty()) {
			head=nn;
			tail=nn;
			size++;
		}else {
			tail.next=nn;
			tail=nn;
			size++;
		}
		
	}
	
	public void addFirst(int item) {
		node nn=new node();
		nn.val=item;
		if(isEmpty()) {
			head=nn;
			tail=nn;
			size++;
		}else {
			nn.next=head;
			head=nn;
			size++;
		}
	}
	
	public int getFirst() {
		
		if(isEmpty()) {
			System.out.println("Linked List is Empty");
		}
		
		return head.val;
		
	}
	
	public int getLast() {
		if(isEmpty()) {
			System.out.println("LinkedList is Empty");
		}
		
		return tail.val;
	}
	
	public int size() {
		return size;
	}
	
	public void addAt(int item,int idx) {
		
		if(isEmpty()) {
			System.out.println("Linked List is Empty");
		}
		if(idx<0 || idx>=size) {
			System.out.println("Index is Invalid");
		}
			
			node temp=head;
			for(int i=0;i<idx-1;i++) {
				temp=temp.next;
			}
			node helper=temp.next;
			node nn=new node();
			nn.val=item;
			temp.next=nn;
			nn.next=helper;
			temp=helper;
			size++;	
	}
	
	
	public int getAt(int idx) {
		if(isEmpty()) {
			System.out.println("LinkedList Is Empty");
		}
		if(idx<0 || idx>=size) {
			System.out.println("Index is Invalid");
		}
		
		node temp=head;
		for(int i=0;i<idx-1;i++) {
			temp=temp.next;
		}
		
		return  temp.val;
	}
	
	
	public node getNodeAt(int idx) {
		if(isEmpty()) {
			System.out.println("LinkedList Is Empty");
		}
		if(idx<0 || idx>=size) {
			System.out.println("Index is Invalid");
		}
		
		node temp=head;
		for(int i=0;i<idx-1;i++) {
			temp=temp.next;
		}
		
		return  temp;
	}
	
	public int removeFirst() {
		if(isEmpty()) {
			System.out.println("LinkedList Is Empty");
		}
		
		int temp=head.val;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}else {
			head=head.next;
			size--;
		}
		return temp;
	}
	
	
	public int removeLast() {
		if(isEmpty()) {
			System.out.println("linkedList is Empty");
		}
		int item=tail.val;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}else {
			node temp=getNodeAt(size-1);
			temp.next=null;
			tail=temp;
			size--;
			
		}
		return item;
	}
	

	public int removeAt(int idx) {
		
		if(isEmpty()) {
			System.out.println("Linked List is Empty");
		}
		if(idx<0 || idx>=size) {
			System.out.println("Index is Invalid");
		}
		
		node first=getNodeAt(idx-1);
		node real=getNodeAt(idx);
		node last=getNodeAt(idx+1);
		first.next=last;
		size--;
		return real.val;
	}
	
	public void display() {
		
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		
	}
	
}
