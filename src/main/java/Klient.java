public class Klient {

    private String wlasciciel;
    private boolean portfel;
    public String name;

    public Klient (String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }


        public enum metodaPlatnosci {
            KARTA("karta"),
            GOTOWKA("gotówka");

            private final String name;

            metodaPlatnosci(String name) {
                this.name = name;
            }

            String metodaPlatnosci() {
                return metodaPlatnosci();
            }
            
        }
    }
