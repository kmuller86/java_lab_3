public class Prezes extends Kierownik {
    int przychod;

    public Prezes() {
        super();
        this.przychod = 0;
    }

    public Prezes(int przychod) {
        this.przychod = przychod;
    }

    public Prezes(int premia, int przychod) {
        super(premia);
        this.przychod = przychod;
    }

    public Prezes(String imie, String nazwisko, int pieniadze, int premia) {
        super(imie, nazwisko, pieniadze, premia);
    }

    public Prezes(String imie, String nazwisko, int pieniadze, int premia, int przychod) {
        super(imie, nazwisko, pieniadze, premia);
        this.przychod = przychod;
    }

    @Override
    public int wyliczPieniadze() {
        return super.wyliczPieniadze() + przychod;
    }

    /* Metoda toString() za pomocą której będziemy wyświetlać zawartość klas */
    @Override
    public String toString() {
        return "Prezes: {" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pieniadze=" + pieniadze +
                ", premia=" + premia +
                ", przychod=" + przychod +
                '}';
    }

    /* Proszę odkomentować i przetestować działanie */
//    @Override
//    public String toString() {
//        return "Prezes: {" +
//                super.toString() +
//                ", przychod=" + przychod +
//                '}';
//    }

}
