/**
 * Test del {@code MCD} di due numeri naturali {@code x} e {@code y}.
 */
public class MCDRecTest {
	public static void main(String[] args) {
		System.out.println("---- mcdRec");
		System.out.println(MCDRec.mcdRec(2322, 654)); // atteso 6
		System.out.println(MCDRec.mcdRec(2322, 654)); // atteso 6
		System.out.println(MCDRec.mcdRec(54, 24)); // atteso 6
		System.out.println(MCDRec.mcdRec(18, 84)); // atteso 6
		System.out.println(MCDRec.mcdRec(4, 2)); // atteso 2
		System.out.println(MCDRec.mcdRec(242, 375)); // atteso 1
		
		System.out.println("---- mcdRecAlt");
		System.out.println(MCDRec.mcdRecAlt(2322, 654)); // atteso 6
		System.out.println(MCDRec.mcdRecAlt(2322, 654)); // atteso 6
		System.out.println(MCDRec.mcdRecAlt(54, 24)); // atteso 6
		System.out.println(MCDRec.mcdRecAlt(18, 84)); // atteso 6
		System.out.println(MCDRec.mcdRecAlt(4, 2)); // atteso 2
		System.out.println(MCDRec.mcdRecAlt(242, 375)); // atteso 1
	}
}