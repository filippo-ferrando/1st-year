public class PilaIntTest {

	public static void main(String[] args) {
		PilaInt.reset();
		// PilaInt.stack[PilaInt.top] = 1; // accesso diretto vietato	
		PilaInt.push(1);
		System.out.println(PilaInt.toStr());
		PilaInt.push(2);
		System.out.println(PilaInt.toStr());
		PilaInt.push(3);
		System.out.println(PilaInt.toStr());
		PilaInt.push(4);		
		System.out.println(PilaInt.toStr());
		PilaInt.reset();
		System.out.println(PilaInt.toStr());
		PilaInt.push(10);
		System.out.println(PilaInt.toStr());
		PilaInt.push(20);
		System.out.println(PilaInt.toStr());
		PilaInt.push(30);
		System.out.println(PilaInt.toStr());
		PilaInt.push(40);
		System.out.println(PilaInt.toStr());
		PilaInt.pop();
		System.out.println(PilaInt.toStr());
		PilaInt.pop();
		System.out.println(PilaInt.toStr());
	}
}
