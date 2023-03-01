/**
 * Test del {@code MCD} di due numeri naturali {@code x} e {@code y}.
 */
public class MCDTest {
	public static void main(String[] args) {
		System.out.println(MCD.mcdDifferenzeAlternate(2322, 654)); // atteso 6
		System.out.println(MCD.mcdDifferenzeInBlocco(2322, 654)); // atteso 6
		System.out.println(MCD.mcdModulo00(2322, 654)); // atteso
		System.out.println(MCD.mcdModulo01(2322, 654)); // atteso

		System.out.println(MCD.mcdDifferenzeAlternate(54, 24)); // atteso 6
		System.out.println(MCD.mcdDifferenzeInBlocco(54, 24)); // atteso 6
		System.out.println(MCD.mcdModulo00(54, 24)); // atteso 6
		System.out.println(MCD.mcdModulo01(54, 24)); // atteso 6

		System.out.println(MCD.mcdDifferenzeAlternate(4, 2)); // atteso 2
		System.out.println(MCD.mcdDifferenzeInBlocco(4, 2)); // atteso 2
		System.out.println(MCD.mcdModulo00(4, 2)); // atteso 2
		System.out.println(MCD.mcdModulo01(4, 2)); // atteso 2
	}
}