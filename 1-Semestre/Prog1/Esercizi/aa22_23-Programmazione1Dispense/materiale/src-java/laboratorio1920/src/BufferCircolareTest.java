public class BufferCircolareTest {
	public static void main(String[] args) {

		int[] buffer = new int[2];
		BufferCircolare.inizializza(buffer);

		System.out.println(BufferCircolare.in(buffer, 10) == true);
		System.out.println(BufferCircolare.primo == 0);
		System.out.println(BufferCircolare.ultimo == 1);
		System.out.println(BufferCircolare.inversione == false);

		System.out.println(BufferCircolare.in(buffer, 11) == true);
		System.out.println(BufferCircolare.primo == 0);
		System.out.println(BufferCircolare.ultimo == 0);
		System.out.println(BufferCircolare.inversione == true);

		System.out.println(BufferCircolare.in(buffer, 12) == false);
		System.out.println(BufferCircolare.primo == 0);
		System.out.println(BufferCircolare.ultimo == 0);
		System.out.println(BufferCircolare.inversione == true);

		System.out.println(BufferCircolare.out(buffer) == true);
		System.out.println(BufferCircolare.primo == 1);
		System.out.println(BufferCircolare.ultimo == 0);
		System.out.println(BufferCircolare.inversione == true);

		System.out.println(BufferCircolare.out(buffer) == true);
		System.out.println(BufferCircolare.primo == 0);
		System.out.println(BufferCircolare.ultimo == 0);
		System.out.println(BufferCircolare.inversione == false);

		System.out.println(BufferCircolare.out(buffer) == false);
		System.out.println(BufferCircolare.primo == 0);
		System.out.println(BufferCircolare.ultimo == 0);
		System.out.println(BufferCircolare.inversione == false);
	}
}
