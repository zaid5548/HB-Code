package Data_Structue_LinkedList;

public class LinkedList {

	
	class Node{
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public boolean isEmpty(){
		
		return head==null;
		
	}
	
	public int getFirst() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Linked List is Empty");
		}
		
		return head.val;
		
	}
	
public int getLast() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Linked List is Empty");
		}
		
		return tail.val;
		
	}
	
	public void addLast(int item) {
		Node nn=new Node();
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
		
		Node nn=new Node();
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
	
	public int getAt(int idx) throws Exception {
		
		if(isEmpty()) {
			throw new Exception("LinkdList Is Empty");
		}
		
		Node temp=head;
		for(int i=1;i<=idx;i++) {
			temp=temp.next;
		}
		
		return temp.val;
	}
	
public Node getNodeAt(int idx) throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Invalid Index");
		}
		if(idx<0 || idx>=size) {
			throw new Exception("Invalid Index");
		}
		Node temp=head;
		for(int i=1;i<=idx;i++) {
			temp=temp.next;
		}
		
		return temp;
	}
	
	public void getAddAt(int item,int idx) throws Exception {
		
		if(idx<0 || idx>size) {
			throw new Exception("Invalid Index");
		}
		
		if(idx==0) {
			addFirst(item);
		}else if(idx==size) {
			addLast(item);
		}else {
		Node nn=new Node();
		nn.val=item;
		Node PNode=getNodeAt(idx-1);
		Node CNode=PNode.next;
		
		PNode.next=nn;
		nn.next=CNode;
		size++; 
		}
	}
	
	public int removeFirst() throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList is Empty");
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
	
	public int removeLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList is Empty");
		}
		int temp=tail.val;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}else {
			Node PNode=getNodeAt(size-2);
			PNode.next=null;
			tail=PNode;
			size--;
		}
		return temp;
	}
	
	public int removeAt(int idx) throws Exception {
		
		if(isEmpty()) {
			throw new Exception("LinkedList is Empty");
		}
		if(idx<0 || idx>size) {
			throw new Exception("Invalid Index");

		}
		
		if(idx==0) {
			return removeFirst();
		}else if(idx==size-1) {
			return removeLast();
		}else {
			
			Node PreNode=getNodeAt(idx-1);
			Node NextNode=getNodeAt(idx+1);
			Node CNode=PreNode.next;
			int temp=CNode.val;
			PreNode.next=NextNode;
			CNode.next=null;
			size--;
			return temp;
		}
	
	}
	
	
	public void RDI() throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList is Empty");
		}
		int i=0;
		int j=size-1;
		while(i<j) {
			Node low=getNodeAt(i);
			Node high=getNodeAt(j);
			int temp=low.val;
			low.val=high.val;
			high.val=temp;
			i++;
			j--;
		}
	}
	
	public void RPI() throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList is Empty");
		}
		Node prev=null;
		Node curr=head;
		while(prev!=head) {
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		Node temp=head;
		head=tail;
		tail=temp;
	}
	
	public void RPR() throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList is Empty");
		}
		RPR(null,head);
		Node temp=head;
		head=tail;
		tail=temp;
	}
	
	public void RPR(Node prev,Node curr) {
		if(curr==null) {
			return;
		}
		RPR(curr,curr.next);
		curr.next=prev;
	}
	
	public void display() {
		Node temp;
		temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
	}
	
	class mover{
		Node left;
	}
	
	public void fold() {
		mover m=new mover();
		m.left=head;
		fold(m,head,0);
		
	}
	
	public void fold(mover m,Node right,int count) {
		
		if(right==null) {
			return;
		}
		
		fold(m,right.next,count+1);
		
		if(count>size/2) {
			
		Node ahead=m.left.next;
		m.left.next=right;
		right.next=ahead;
		
		m.left=ahead;
		
		}
		
		if(count==size/2) {
			tail=right;
			tail.next=null;
			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
