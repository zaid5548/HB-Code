package Data_Structure;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack_Created st=new Stack_Created(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);

		System.out.println("Stack display");
		st.display();
		System.out.println("popped element"+st.pop());
		System.out.println("popped element"+st.pop());
		System.out.println("popped element"+st.pop());
		System.out.println("popped element"+st.pop());
		System.out.println("popped element"+st.pop());
		System.out.println("popped element"+st.pop());
		System.out.println("popped element"+st.pop());

		st.display();
		System.out.println("Top element of stack"+st.peek());
		st.display();
	}

}
