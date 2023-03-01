/**
 * Classe con due metodi, uno iterativo, l'altro ricorsivo che, riconoscono
 * stringhe palindrome lette da tastiera. Esempi di stringhe palindrome sono
 * radar, anna, otto
 */
public class StringaPalindroma {

	public static boolean palindroma(String s) {
		boolean p = true;
		for (int i = 0; p && i < s.length() / 2; i++)
			p = (s.charAt(i) == s.charAt(s.length() - (i + 1)));
		return p;
	}

	public static boolean palindromaRec(String s) {
		if (s.length() == 1 || s.length() == 0)
			return true;
		else
			return (s.charAt(0) == s.charAt(s.length() - 1))
					&& palindromaRec(s.substring(1, s.length() - 1));
	}

	public static void main(String[] args) {
		System.out.println("Stringa?");
		String s = SIn.readLine();
		System.out.println(palindroma(s));
		System.out.println(palindromaRec(s));
	}

}
