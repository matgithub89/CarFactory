public class Producent {
    private String marka;
    private String model;
    private String kolor;
    private int moc;
    private int pojemnosc;

    public Producent(String marka, String model, String kolor, int moc, int pojemnosc) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.moc = moc;
        this.pojemnosc = pojemnosc;
    }

    public  String  toString(){

      return "wyprodukowano samochod "+this.marka+" ,model "+this.model+" ,kolor "+this.kolor+" ,moc "+this.moc+" ,pojemnosc "+this.pojemnosc;
    }

}
