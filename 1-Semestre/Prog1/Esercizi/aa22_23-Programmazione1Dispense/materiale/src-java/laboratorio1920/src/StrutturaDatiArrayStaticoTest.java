public class StrutturaDatiArrayStaticoTest {

	public static void aggiungi(int delta) {
		if (StrutturaDatiArrayStatico.i < StrutturaDatiArrayStatico.a.length) {
			StrutturaDatiArrayStatico.a[StrutturaDatiArrayStatico.i] 
					= StrutturaDatiArrayStatico.a[StrutturaDatiArrayStatico.i]
					   + delta;
			StrutturaDatiArrayStatico.i++;
		}
	}

	public static void main(String[] args) {
		StrutturaDatiArrayStatico.stampaA();      // 1
		StrutturaDatiArrayStatico.aggiungi(1);    // 2
		StrutturaDatiArrayStatico.stampaA();      // 3
		aggiungi(1); // usa metodo di questa         4
		             // classe su campi statici 
		             // in StrutturaDatiArrayStatico
		StrutturaDatiArrayStatico.stampaA();      // 5
	}
}
