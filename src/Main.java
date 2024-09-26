public class Main {
    public static void main(String[] args) {

        Notatka notatka1 = new Notatka("Test", "Testowanie!");
        Notatka notatka2 = new Notatka("Dowidzenia", "Dzikoptak");

        notatka1.wyswietlTytul();
        notatka1.wypiszZawartosc();
        notatka2.wyswietlTytul();
        notatka2.wypiszZawartosc();

    }
}