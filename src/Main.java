import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* przykład 2 klasy */
        /* najprostsze użycie klas */
        List<Pojazd> pojazdList = new ArrayList<>();

        /* Deklaracja z inicjalizacją pola 'pojazd' typem Pojazd */
        Pojazd pojazd = new Pojazd();
        pojazd.kolor = KolorEnum.NIEBIESKI;
        pojazd.iloscKol = 4;
        pojazd.nazwa = "Traktor";
        pojazdList.add(pojazd);

        pojazd = new Pojazd();
        pojazd.iloscKol = 2;
        pojazd.nazwa = "Rower";
        pojazd.kolor = KolorEnum.CZERMONY;
        pojazdList.add(pojazd);

        /* Wyświetlenie moetody toString() na objekcie pojazd
         * Można tą metodę nadpisać, w kolejnym przykładzie pokżę jak, więc proszę to zapamiętać */
        System.out.println(pojazd.toString()); // Pojazd@7229724f (wyświetla adres objektu pojazd)

        for (Pojazd p : pojazdList) {
            System.out.println(p.nazwa + " - " + p.iloscKol + " - " + p.kolor);
        }

    }
}

/* Prosta klasa */
class Pojazd {
    String nazwa;
    KolorEnum kolor;
    int iloscKol;
}

enum KolorEnum {
    CZERMONY, ZIELONY, NIEBIESKI
}

