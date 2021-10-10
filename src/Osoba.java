/* klasa Osoba - klasa bazowa (Rodzic innych klas) */
public class Osoba {
    /* pola klasy Osoba, slowko protected oznacza, ze klasy dziedziczące
     * po tej klasie będą widziały te pola */
    protected String imie;
    protected String nazwisko;
    protected int pieniadze;
    private boolean czyOsoba; // pole prywatne klasy dziedziczące nie mogą używać tego pola

    /* Konstruktory */
    public Osoba() {
        this.imie = "";
        this.nazwisko = "";
        this.pieniadze = 0;
        czyOsoba = true;
    }

    public Osoba(String imie, String nazwisko, int pieniadze) {
        super();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pieniadze = pieniadze;
        czyOsoba = true;
    }

    public int wyliczPieniadze() {
        return this.pieniadze;
    }

    /* Metoda toString() za pomocą której będziemy wyświetlać zawartość klas */
    @Override
    public String toString() {
        return "Osoba: {" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", czyOsoba='" + (czyOsoba ? "Tak" : "Nie") + '\'' +
                ", pieniadze=" + pieniadze +
                '}';
    }
}
