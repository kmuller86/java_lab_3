import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* Przykład 5 Dziedziczenie */

        /* Polecam zakomentować cały kod z main i odkomentowywać kolejne linie programu
        * aby lepiej zrozumieć działanie dziedziczenia i klas */

        /* Tworzymy objekty wszystkich typów i wyświetlamy ich zawartość */
        Osoba osoba = new Osoba("Krzysztof", "Ignaczak", 2000);
        System.out.println(osoba.toString());
        System.out.println("Moje pieniążki: " + osoba.wyliczPieniadze() + "\n");

        Kierownik kierownik = new Kierownik("Ilona", "Teodorczyk", 2000, 1000);
        System.out.println(kierownik.toString());
        System.out.println("Moje pieniążki: " + kierownik.wyliczPieniadze() + "\n");

        Prezes prezes1 = new Prezes("Artur", "Janiak", 2000, 1000, 50000);
        System.out.println(prezes1.toString());
        System.out.println("Moje pieniążki: " + prezes1.wyliczPieniadze() + "\n");

        Prezes prezes2 = new Prezes("Kamil", "Matuszak", 8000, 7000);
        System.out.println(prezes2.toString());
        System.out.println("Moje pieniążki: " + prezes2.wyliczPieniadze() + "\n");

        /* Klasa Osoba jest najbardziej generyczną z klas w naszym układzie dziedziczenia po sobie, dzięki temu
         * możemy dodać do listy klasy potomne (Klasy które dziedziczą po klasie Osoba)  */
        List<Osoba> osobaLista = new ArrayList<>();
        osobaLista.add(osoba);
        osobaLista.add(kierownik);
        osobaLista.add(prezes1);
        osobaLista.add(prezes2);
        System.out.println(osobaLista);

        /* Nie możemy dodać do Listy typu Prezes objektów typu rodziców (Osoba, Kierownik)
         * ponieważ Prezes jest klasą która dziedziczy z powyższych klas i nie rozpoznaje Klas bardziej generycznych
         * rozpoznawanie klas działa tylko w dół */
        List<Prezes> prezesList = new ArrayList<>();
        prezesList.add(prezes1);
        prezesList.add(prezes2);
//        prezesList.add(osoba);
//        prezesList.add(kierownik);
        System.out.println(prezesList);

        /* Tak jak powyżej możemy użyć jako typ klasy najbardziej generycznej
         * i inicjalizować ją konkretną klasą dziedziczącą po klasie osoba
         * to zachowanie jest często preferowane, sprawia, że kod jest bardziej elastyczny */
        Osoba osoba2 = new Prezes("Adam", "Baron", 5000, 6000, 10000);
        System.out.println("\n" + osoba2.toString());

        osoba2 = new Kierownik("Roman", "Piwowarczyk", 6000, 4000);
        System.out.println(osoba2.toString());

        /* Klasa Object jest klasą generyczną z której dziedziczą wszystkie klasy w java
         * dzięki temu można ją użyć jako najbardziej generyczny Typ i wszystkie jej metody
         * Najbardziej chyba przydatne jeśli otrzymujemy z innego systemu/źródła klasę której
         * od razu nie możemy określić, lub której wcale nie musimy Typować */
        Object osoba3 = new Osoba("Mikolaj", "Brodnicki", 2500);
        System.out.println("\n" + osoba3.toString());

        osoba3 = new Kierownik("Mikolaj", "Brodnicki", 2500, 1000);
        System.out.println(osoba3.toString());

        osoba3 = new Prezes("Mikolaj", "Brodnicki", 2500, 1000, 15);
        System.out.println(osoba3.toString());

    }
}
