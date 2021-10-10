public class Kierownik extends Osoba {
    /* pola klasy Kierownik:
     * posiada pole "premia" oraz wszystkie pola  */
    int premia;

    public Kierownik() {
        super();
        this.premia = 0;
    }

    public Kierownik(int premia) {
        this.premia = premia;
    }

    public Kierownik(String imie, String nazwisko, int pieniadze, int premia) {
        super(imie, nazwisko, pieniadze);
        this.premia = premia;
    }

    @Override
    public int wyliczPieniadze() {
        return super.wyliczPieniadze() + premia;
    }

    /* Metoda toString() za pomocą której będziemy wyświetlać zawartość klas */
    /* prosze odkomentowac tą metodę i zakomentować drugą metodę toString
    * można przetestować, że nie mamy dostępu do zmiennej prywatnej czyOsoba, mimo to
    * możemy nią operować jeśli stworzymy gettery i settery */
/*    @Override
    public String toString() {
        return "Kierownik: {" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
//                ", czyOsoba='" + (czyOsoba ? "Tak" : "Nie") + '\'' +
                ", pieniadze=" + pieniadze +
                ", premia=" + premia +
                '}';
    }*/

    @Override
    public String toString() {
        return "Kierownik: {" +
                super.toString() +
                ", premia=" + premia +
                '}';
    }
}
