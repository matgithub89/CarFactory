import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {


        Producent marka1 = new Producent("Audi", "A3", "grafit", 140, 2000);
        Producent marka2 = new Producent("Ford", "Focus", "pomaranczowy", 300, 2500);
        Producent marka3 = new Producent("Volvo", "S40", "czarny", 140, 2000);
        Sprzedawca sprzedawca1 = new Sprzedawca(20000, "Janusz", 0, marka2);
        Sprzedawca sprzedawca2 = new Sprzedawca(18000, "Justyna", 0, marka3);
        Klient klient1 = new Klient("Jan Kowalski");

        System.out.println(marka1.toString());
        System.out.println(marka2.toString());
        System.out.println(marka3.toString());


    }

}
