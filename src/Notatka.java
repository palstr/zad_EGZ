public class Notatka {
    /**********
     * klasa: Notatka
     * opis: klasa ta tworzy notatkę na podstawie danych wprowadzonych w kodzie.
     * pola: identyfikatorNotatek - pole numeryczne przechowujące identyfikator notatki.
     *       licznikNotatek - pole numeryczne przechowujące aktualną liczbę notatek.
     *       tytulNotatki - pole tekstowe przechowujące tytuł notatki.
     *       trescNotatki - pole tekstowe przechowujące treść notatki.
     *
     * autor: 00000000000
    * **********/

    private int identyfikatorNotatek;
    private static int licznikNotatek;
    protected String tytulNotatki;
    protected String trescNotatki;

    public Notatka(String tytulNotatki, String trescNotatki) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
        licznikNotatek++;
        this.identyfikatorNotatek = licznikNotatek;
    }
    public void wyswietlTytul(){
        System.out.println("Tytul: " + tytulNotatki + ". Tresc: " + trescNotatki);
    }
    public void wypiszZawartosc(){
        System.out.println("ID: " + identyfikatorNotatek + "; Liczba notatek: " + licznikNotatek + "; Tytuł notatki: " + tytulNotatki + "; Treść notatki: " + trescNotatki + ";");
    }

}
