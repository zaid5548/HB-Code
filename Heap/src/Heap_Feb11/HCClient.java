package Heap_Feb11;

public class HCClient {

	public static void main(String[] args) {

		Heap_1 hp = new Heap_1();
		hp.add(2);
		hp.add(5);
		hp.add(3);
		hp.add(1);
		hp.add(6);
		hp.add(9);
		hp.display();
		while (!hp.isEmpty())
			System.out.println(hp.remove());
	}

}
