/** 
 * Stampa della tavola pitagorica.
 * <p>
 * Un esercizio è usare {@link MatriceVisualeNMWhile}
 * come ispirazione per aggiungere le proprietà invarianti.
 */
public class TavolaPitagoricaWhile
{
  public static void main(String[] args) {

    System.out.println("   Tavola Pitagorica -----------");

    int i = 1;
    int j = 1;
    /* per ogni k,
     * se 1<=k<1, allora k-esima tabellina completamente stampata
     * && per ogni k', se 1<=k'<1, allora il i*k' è stato stampato
     * e' vero, ovvero descrive la situazione in cui non e' stato stampato
     * alcunche', perche' entrambe le premesse delle implicazioni sono vacue.
     */
    
    while (i<11) {

      while (j<11) {
         /* per ogni k,
          * se 1<=k<i, allora k-esima tabellina completamente stampata
          * && per ogni k', se 1<=k'<j, allora il i*k' è stato stampato
          */

        System.out.print(i*j);
         /* per ogni k,
          * se 1<=k<i, allora k-esima tabellina completamente stampata
          * && per ogni k', se 1<=k'<j+1, allora il i*k' è stato stampato
          */

        j = j + 1;
         /* j e' diventato un nome per l'espressione j+1. Quindi:
          * per ogni k,
          * se 1<=k<i, allora k-esima tabellina completamente stampata
          * && per ogni k', se 1<=k'<j, allora il i*k' è stato stampato
          */
      }
      /* j == 11 implica che la riga di indice i e' stata completata.
       * Quindi la situazion e' descritta da:
       * per ogni k,
       * se 1<=k<i+1, allora k-esima tabellina completamente stampata
       * && per ogni k', se 1<=k'<1, allora il (i+1)*k' è stato stampato
       */

      i = i + 1;

      /* i e' diventato un nome per l'espressione i+1. Quindi:
       * per ogni k,
       * se 1<=k<i, allora k-esima tabellina completamente stampata
       * && per ogni k', se 1<=k'<1, allora il i*k' è stato stampato
       */
      System.out.println();
      j = 1;
      /* j e' diventato un nome per l'espressione 0. Quindi:
       * per ogni k,
       * se 1<=k<i, allora k-esima tabellina completamente stampata
       * && per ogni k', se 1<=k'<j, allora il i*k' è stato stampato
       */
    }
    /* j == 1 e i == 11 implicano:
     * per ogni k,
     * se 1<=k<11, allora k-esima tabellina completamente stampata
     * && per ogni k', se 1<=k'<1, allora il 11*k' è stato stampato
     * Ovvero, sono state stampate le tabelline tra l'1 ed il 10.
     */
  }
}
