package Stack_Queue;

public class Client_Dynemic_Stack {

	public static void main(String[] args) throws Exception {
		Dynemic_Stack ds=new Dynemic_Stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(70);
		ds.push(80);
		ds.push(90);
		ds.push(100);
		ds.push(110);
		ds.push(120);
		ds.push(130);
		ds.push(140);
		ds.push(150);
		ds.display();
		System.out.println("*********");
		System.out.println("Poped ELement is "+ds.pop());
		System.out.println("Size of Stack is "+ds.size());
	}

}
