public class Laskukone {
    double tulos;

    public Laskukone() {
        nollaa();
    }

    public void lisaaLuku(int luku) {
        tulos += luku;
    }

    public void vahennaLuku(int luku) {
        tulos -= luku;
    }

    public void kerroLuvulla(int luku, int luku2) {
        tulos = luku*luku2;
    }

    public void korotaPotenssiin(int luku, int potenssi) {
       tulos = Math.pow(luku,potenssi);
    }

    public double annaTulos() {
        return tulos;
    }

    public void nollaa() {
        tulos = 0;
    }
}