import java.util.Scanner;

public class Main {

    public static int obliczNWD(int a, int b) {
        /**********
         * nazwa funkcji: obliczNWD
         * opis funkcji: funkcja ta oblicza największy wspólny dzielnik dwóch wpisanych przez użytkownika liczb.
         * parametry: a - przechowuje pierwszą wpisaną liczbę.
         *            b - przechowuje drugą wpisaną liczbę.
         * zwracany typ i opis: funkcja zwracja int'a będącego największym wspólnym dzielnikiem dwóch liczb.
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

            System.out.println("NWD dla wpisanych liczb wynosi " + obliczNWD(a, b));

    }
}
