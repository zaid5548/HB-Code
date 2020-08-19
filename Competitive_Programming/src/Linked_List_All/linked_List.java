package Linked_List_All;


public class linked_List {

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
	
	public int getFirst() throws Exception {
		if(isEmpty()) {
			 throw new Exception("Linked List is Empty");
		}
		return head.val;
	}
	
	public int getLast() throws Exception {
		if(isEmpty()) {
			 throw new Exception("Linked List is Empty");
		}
		return tail.val;
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
	
	public int getAt(int idx) throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList is Empty");
		}
		
		if(idx<0 || idx>=size) {
			throw new Exception("LinkedList is Empty");
		}
		
		node temp=head;
		for(int i=0;i<idx;i++) {
			temp=temp.next;
		}
		return temp.val;
		
	}
	
	public node getNodeAt(int idx) throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList is Empty");
		}
		
		if(idx<0 || idx>=size) {
			throw new Exception("Invalid Index");
		}
		
		node temp=head;
		for(int i=0;i<idx;i++) {
			temp=temp.next;
		}
		return temp;
		
	}
	
	public void addAt(int item,int idx) throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList Is Empty");
		}
		if(idx<0 || idx>=size) {
			throw new Exception("Invalid Index");
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
		
	}
	
	public int removeFirst() throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList Is Empty");
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
			throw new Exception("LinkedList Is Empty");
		}
		int temp=tail.val;

		if(size==1) {
			head=null;
			tail=null;
			size--;
		}else {
			node res=getNodeAt(size-2);
			res.next=null;
			tail=res;
			size--;
		}
		
		return temp;
	}
	
	public int removeAt(int idx) throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList Is Empty");
		}
		
		if(idx<0 || idx>=size) {
			throw new Exception("Invalid Index");
		}


		if(idx==0) {
			return removeFirst();
		}else {
			node n1=getNodeAt(idx-1);
			node n=n1.next;
			node n2=n.next;
			n1.next=n2;
			size--;
			return n.val;
		}
	}
	
	public void reverseDataLinkedList() throws Exception {
		
		int left=0;
		int right=size-1;
		while(left<right) {
			
			node ln=getNodeAt(left);
			node rn=getNodeAt(right);
			int temp=ln.val;
			ln.val=rn.val;
			rn.val=temp;
			left++;
			right--;
		}
		
	}
	
	public void reversePointerLinkedList() {
		
		node prev=this.head;
		node curr=prev.next;
		while(curr!=null) {
			
			node ahead=curr.next;
			curr.next=prev;
			prev=curr;
			curr=ahead;			
		}
		node t=this.head;
		this.head=this.tail;
		this.tail=t;
		this.tail.next=null;
		
	}
	
	public void RPR() {
		RPR(null,head);
		node temp=head;
		head=tail;
		tail=temp;
	}
	
	private void RPR(node prev, node curr) {
		if(curr==null) {
			return;
		}
		RPR(curr,curr.next);
		curr.next=prev;
		
	}
	
	class mover{
		node left;
	}
	
	public void fold() {
		mover m=new mover();
		m.left=head;
		fold(m,head,0);
		
	}
	
	public void fold(mover m,node right,int count) {
		
		if(right==null) {
			return;
		}
		
		fold(m,right.next,count+1);
		
		if(count>size/2) {
			
		node ahead=m.left.next;
		m.left.next=right;
		right.next=ahead;
		
		m.left=ahead;
		
		}
		
		if(count==size/2) {
			tail=right;
			tail.next=null;
			
		}
		
	}

	public int MidLinkedList() {
		node slow=this.head;
		node fast=this.head;
		while(fast.next!=null && fast.next.next!=null) {
			
			slow=slow.next;
			fast=fast.next.next;
			
		}
		return slow.val;
	}
	
	public void display() {
		
		node temp=head;
		
		while(temp!=null) {
		System.out.print(temp.val+" ");
		temp=temp.next;
		}
		System.out.println();
	}
	
}
