public class Main {

    public static void main(String[] args) {

        /* przykład 1 enum-y */
        /* Najprostsze Użycie enumów jako prosty typ wyliczeniowy */
        System.out.println("kolor " + KolorEnum.CZERWONY);

        /* użycie enuma */
        String[] kolory = {KolorEnum.NIEBIESKI.toString(), KolorEnum.ZIELONY.toString()};
        System.out.println("Drugi kolor to: " + kolory[1]);

        /* Użycie enumów z booleanem i metodą */
        drukujDoKonsoli(WielkoscEnum.MALY, "dlugopis");
        drukujDoKonsoli(WielkoscEnum.DUZY, "Dom");
        System.out.println();


        /* przykład 1b enum-y */
        boolean[] prawdaArray = {false, false, true, false, true, true};
        for (boolean zmienna : prawdaArray) {
            if (zmienna) {
                System.out.println("Czy prawda: " + PrawdaEnum.TAK);
            } else {
                System.out.println("Czy prawda: " + PrawdaEnum.NIE);
            }
        }
        System.out.println();

        /* przykład 1c enum-y */
        char[] znaki = {'S', 'A', 'H', 'A', 'A', 'H', 'A', 'N'};

        for (char znak : znaki) {
            switch (znak) {
                case 'S':
                    System.out.println("Status: " + StatusEnum.USUNIETE);
                    break;
                case 'A':
                    System.out.println("Status: " + StatusEnum.AKTUALNE);
                    break;
                case 'N':
                    System.out.println("Status: " + StatusEnum.NIE_AKTUALNE);
                    break;
                case 'H':
                    System.out.println("Status: " + StatusEnum.HISTORYCZNE);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + znak);
            }
        }

    }

    static void drukujDoKonsoli(WielkoscEnum wartosc, String przedmiot) {
        System.out.println(przedmiot + " jest " + wartosc + " " + wartosc.wielkosc);
    }
}

/* Prosty enum */
enum KolorEnum {
    CZERWONY, ZIELONY, NIEBIESKI;
}

/* enum z metodą i zmienną */
enum WielkoscEnum {
    MALY(false), DUZY(true), SREDNI(false), OGROMNY(true);

    boolean wielkosc;

    WielkoscEnum(boolean czyDuzy) {
        wielkosc = czyDuzy;
    }
}

enum PrawdaEnum {
    TAK(true), NIE(false);

    final boolean prawda;

    PrawdaEnum(boolean czyPrawda) {
        prawda = czyPrawda;
    }
}

enum StatusEnum {
    AKTUALNE('A'), NIE_AKTUALNE('N'), HISTORYCZNE('H'), USUNIETE('S');

    final char status;

    StatusEnum(char status) {
        this.status = status;
    }
}
