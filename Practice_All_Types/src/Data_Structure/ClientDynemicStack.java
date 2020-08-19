package Data_Structure;

public class ClientDynemicStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynemicStack ds=new DynemicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(70);
		ds.display();
		System.out.println("First Pop-> "+ds.pop());
		System.out.println("Second Pop-> "+ds.pop());
		System.out.println("Third Pop-> "+ds.pop());
		System.out.println("Fourth Pop-> "+ds.pop());
		System.out.println("Fifth Pop-> "+ds.pop());
		ds.display();
		System.out.println("********************");
		ds.push(80);
		ds.push(90);
		ds.push(100);
		ds.push(110);
		ds.display();

	}
	
	

}
