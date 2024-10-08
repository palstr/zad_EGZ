import java.util.Scanner;

public class Main {

    public static int obliczNWD(int a, int b) {
        /**********
         * nazwa funkcji: obliczNWD
         * opis funkcji: funkcja ta oblicza największy wspólny dzielnik dwóch wpisanych przez użytkownika liczb metodą Euklidesa.
         * parametry: a - przechowuje pierwszą wpisaną liczbę typu całkowitego.
         *            b - przechowuje drugą wpisaną liczbę typu całkowitego.
         * zwracany typ i opis: funkcja zwraca liczbę całkowitą będącą największym wspólnym dzielnikiem dwóch liczb.
         * autor: 00000000000
         * **********/


        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        Notatka notatka1 = new Notatka("Test", "Testowanie!");
        notatka1.wyswietlTytul();
        notatka1.wypiszZawartosc();

        Notatka notatka2 = new Notatka("Dowidzenia", "Dzikoptak");
        notatka2.wyswietlTytul();
        notatka2.wypiszZawartosc();

        System.out.println("--------------------------");

        System.out.println("Wpisz pierwszą liczbę: ");
        Scanner klawiatura = new Scanner(System.in);
        int a = klawiatura.nextInt();

        System.out.println("Wpisz drugą liczbę: ");
        int b = klawiatura.nextInt();

        if (a < 1 || b < 1) {
            System.out.println("Niewłaściwe liczby!");
        } else {
            System.out.println("NWD dla wpisanych liczb wynosi " + obliczNWD(a, b));
        }

        System.out.println("--------------------------");

        Film film1 = new Film();
        System.out.println("Wpisz nazwę filmu, który chcesz wypożyczyć.");

        String wypozyczam = klawiatura.next();
        film1.setTytulFilmu(wypozyczam);

        System.out.println("Tytuł filmu: " + film1.getTytulFilmu());

        System.out.println("Liczba wypożyczeń przed: " + film1.getLiczbaWypozyczen());
        film1.wypozyczFilm();
        System.out.println("Liczba wypożyczeń po: " + film1.getLiczbaWypozyczen());


    }
}
