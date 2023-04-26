public class poligono {
    public int nLati;
    public float lLati;


    //costruttore vuoto
    poligono(){
        nLati = 0;
        lLati = 0;
    }

    //costruttore parziale
    poligono(int nLati){
        this.nLati = nLati;
        lLati = 0;
    }

    //costruttore parziale
    poligono(float lLati){
        nLati = 0;
        this.lLati = lLati;
    }

    //costruttore completo
    poligono(int nLati, float lLati){
        this.nLati = nLati;
        this.lLati = lLati;
    }

    public float perimetro(){
        return nLati * lLati;
    }
}
