public class PilaCharTest {

	public static void main(String[] args) {
		PilaChar.reset();
		// PilaChar.stack[PilaChar.top] = 'a'; // accesso diretto vietato	
		PilaChar.push('a');
		System.out.println(PilaChar.toStr());
		PilaChar.push('b');
		System.out.println(PilaChar.toStr());
		PilaChar.push('c');
		System.out.println(PilaChar.toStr());
		PilaChar.push('d');		
		System.out.println(PilaChar.toStr());
		PilaChar.reset();
		System.out.println(PilaChar.toStr());
		PilaChar.push('e');
		System.out.println(PilaChar.toStr());
		PilaChar.push('f');
		System.out.println(PilaChar.toStr());
		PilaChar.push('g');
		System.out.println(PilaChar.toStr());
		PilaChar.push('h');
		System.out.println(PilaChar.toStr());
		PilaChar.pop();
		System.out.println(PilaChar.toStr());
		PilaChar.pop();
		System.out.println(PilaChar.toStr());
	}
}
