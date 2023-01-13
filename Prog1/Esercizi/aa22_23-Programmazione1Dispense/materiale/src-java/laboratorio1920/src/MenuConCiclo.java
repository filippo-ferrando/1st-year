/**
 * Classe che offre un menu' con molteplici voci e chiede
 * all’utente di compiere una scelta tra esse. 
 * Il menu' e':
 * <br>
 * a. New document <br>  
 * b. Open document  <br>
 * c. Save as ...    <br>
 * d. Mail document to ... <br>   
 * e. Quit <br>   
 *    Please, make your choice (a-e): 
 * <br>
 * Finche' la scelta non e' Quit, in base alla scelta, la classe deve stampare 
 * sullo standard out quanto segue, prima di terminare:
 * scelta a --> You chose to create a new document.
 * scelta b --> You chose to open a document.
 * scelta c --> You chose to save the document. 
 * scelta d --> You chose to send the document.
 * scelta al di fuori dell'intervallo a -- d --> Your choice is not valid.
 */
public class MenuConCiclo {

    public static void main(String[] args) {

        char scelta = ' ';

        do {

            System.out.println("a. New document");
            System.out.println("b. Open document");
            System.out.println("c. Save as ...");
            System.out.println("d. Mail document to ...");
            System.out.println("e. Quit");
            System.out.println("Please, make your choice (a-d):");
            scelta = SIn.readChar();
            SIn.readChar(); // elimina carriage return!
            if (scelta == 'a')
                System.out.println("You chose to create ... ");
            else if (scelta == 'b')
                System.out.println("You chose to open ...");
            else if (scelta == 'c')
                System.out.println("You chose to save ...");
            else if (scelta == 'd')
                System.out.println("You chose to send ...");
            else if (scelta == 'e') {
            } else
                System.out.println("Your choice is not valid.");
        } while (scelta != 'e');

    }
}