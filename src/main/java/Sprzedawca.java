public class Sprzedawca {

    private int cena;
    private String nazwaSprzedawcy;
    private int znizka;
    private Producent producent;

    public Sprzedawca(int cena, String nazwaSprzedawcy, int znizka, Producent producent) {
        this.cena = cena;
        this.nazwaSprzedawcy = nazwaSprzedawcy;
        this.znizka = znizka;

        this.producent = producent;
    }

    public static int cenaModelu(int cena) {
        return cena;
    }

    public static void dodajModel(Producent producent) {
        System.out.println("Dodany samochod to" + producent.toString());
    }

}
