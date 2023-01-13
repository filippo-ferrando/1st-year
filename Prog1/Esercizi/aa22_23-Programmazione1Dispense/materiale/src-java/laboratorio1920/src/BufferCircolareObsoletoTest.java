public class BufferCircolareObsoletoTest {

	public static void main(String[] args) {

		int[] buffer = new int[5];
		BufferCircolareObsoleto.inizializza(buffer);
		
		System.out.println(BufferCircolareObsoleto.in(buffer, 10)==true);
		System.out.println(BufferCircolareObsoleto.primo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.ultimo(buffer)==1);
		System.out.println(BufferCircolareObsoleto.inversione(buffer)==false);

		System.out.println(BufferCircolareObsoleto.in(buffer, 11)==true);
		System.out.println(BufferCircolareObsoleto.primo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.ultimo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.inversione(buffer)==true);

		System.out.println(BufferCircolareObsoleto.in(buffer, 12)==false);
		System.out.println(BufferCircolareObsoleto.primo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.ultimo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.inversione(buffer)==true);

		System.out.println(BufferCircolareObsoleto.out(buffer)==true);
		System.out.println(BufferCircolareObsoleto.primo(buffer)==1);
		System.out.println(BufferCircolareObsoleto.ultimo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.inversione(buffer)==true);

		System.out.println(BufferCircolareObsoleto.out(buffer)==true);
		System.out.println(BufferCircolareObsoleto.primo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.ultimo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.inversione(buffer)==false);

		System.out.println(BufferCircolareObsoleto.out(buffer)==false);
		System.out.println(BufferCircolareObsoleto.primo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.ultimo(buffer)==0);
		System.out.println(BufferCircolareObsoleto.inversione(buffer)==false);
	}
}
