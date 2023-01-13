/**
 * Influenza dell'assegnazione sulle proprieta' dello stato di un programma.
 * <p>
 * Supponiamo che {@code P} sia un predicato in cui compaia un'espressione 
 * {@code e} e che descriva una proprieta' dello stato di un programma.
 * <p>
 * Ad esempio, {@code P} puo' essere {@code (x+1)^2 == y+2*(x+1)-1}. In esso
 * possiamo identificare diverse espressioni che giochino il ruolo di {@code e}:
 * <ol>
 * 	<li> l'espressione {@code e} puo' essere {@code -1}, oppure
 * 	<li> l'espressione {@code e} puo' essere {@code y+2*(x+1)}, oppure
 * 	<li> l'espressione {@code e} puo' essere {@code x+1}.
 * </ol>
 * <p>
 * Supponiamo che {@code e} sia {@code -1}.
 * <ol>
 * 	<li> Se {@code (x+1)^2 == y+2*(x+1)-1} e' vero in un punto del
 * programma, ed in quel punto inseriamo l'assegnazione:
 * <p>
 * <div>
 * 	{@code z = -1;}
 * </div> 
 * <p>
 * allora immediatamente dopo l'assegnazione e' vero il predicato
 * {@code (x+1)^2 == y+2*(x+1)+z}, in cui {@code z} ha rimpiazzato
 * {@code -1}, ovunque l'espressione {@code -1} comparisse.
 *
 * 	<li> Sempre supponendo che {@code (x+1)^2 == y+2*(x+1)-1} sia
 * vero in un punto del programma, assumiamo di inserire l'assegnazione:
 * <p>
 * <div>
 * 	{@code z = y+2*(x+1);}
 * </div> 
 * <p>
 * in quel punto. Immediatamente dopo l'assegnazione e' vero il predicato
 * {@code (x+1)^2 == z-1}, in cui {@code z} ha rimpiazzato
 * {@code y+2*(x+1)} ovunque compaia.
 * 	<li> Infine, se {@code (x+1)^2 == y+2*(x+1)-1} e' vero in un punto del
 * programma, ed in quel punto inseriamo l'assegnazione:
 * <p>
 * <div>
 * 	{@code x = x + 1;}
 * </div> 
 * <p>
 * immediatamente dopo l'assegnazione e' vero il predicato
 * {@code {@code x^2 == y+2*x-1}}, in cui {@code x} ha rimpiazzato
 * {@code x+1} ovunque comparisse.
 * </ol>
 * <p>
 * Quindi, e' possibile usare assegnamenti per rimpiazzare
 * simultaneamente piu' occorrenze della stessa espressione {@code e}
 * in un predicato, senza alterare il valore di verita' del predicato.
 */
public class AssegnazioneCorr {
	
	public static void main(String[] args) {

		int x = 2;
		int y = 4;

		System.out.println("Dati x == " + x + ", y == " + y + ":");
		System.out.print("(x+1)*(x+1) == y+2*(x+1)-1) prima di z = -1 vale ");
		System.out.println(((x+1)*(x+1) == y+2*(x+1)-1));
		int z = -1; 
		System.out.print("(x+1)*(x+1) == y+2*(x+1)+z) dopo z = -1 vale ");
		System.out.println(((x+1)*(x+1) == y+2*(x+1)+z));
		
		System.out.print("(x+1)*(x+1) == y+2*(x+1)+z) prima di x = x+1 vale ");
		System.out.println(((x+1)*(x+1) == y+2*(x+1)+z));
		x = x + 1;
		System.out.print("x*x == y+2*x+z dopo x = x+1 vale ");
		System.out.println((x*x == y+2*x+z));
		
		System.out.print("x*x == y+2*x+z prima di w = 2*x+z vale ");
		System.out.println((x*x == y+2*x+z));
		int w = 2*x+z;
		System.out.print("x*x == y+w dopo w = 2*x+z vale ");
		System.out.println((x*x == y+w));
	}
}