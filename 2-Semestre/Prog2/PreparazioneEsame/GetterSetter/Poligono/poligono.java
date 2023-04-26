public class poligono {

    private int nLati;
    private float lLati;


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

    //getter
    public int getnLati(){
        return nLati;
    }

    public float getlLati(){
        return lLati;
    }

    //setter
    protected void setnLati(int nLati){
        this.nLati = nLati;
    }

    protected void setlLati(float lLati){
        this.lLati = lLati;
    }

    public float perimetro(){
        return nLati * lLati;
    }
}
