public class rettangolo extends poligono {
    rettangolo(int nLati, float lLati){
        assert nLati == 4: "Un rettangolo non può avere più di 4 lati";
        setnLati(nLati);
        setlLati(lLati);
    }
}
