public class Film {
    /**********
     * klasa: Film
     * pola: tytulFilmu - tytuł wypożyczanego filmu. Domyślnie jest 0.
     *       liczbaWypozyczen - ilość razy, którą wypożyczono ten film.
     * metody: setTytulFilmu - ustawia tytuł filmu na ten wpisany przez użytkownika.
     *         getTytulFilmu - zwraca tytuł filmu.
     *         getLiczbaWypozyczen - zwraca liczbę wypożyczeń filmu.
     *         wypozyczFilm - inkrementuje wartość liczbaWypozyczen.
     * informacje: klasa ta definiuje tytuł filmu i liczbę wypożyczeń oraz je zmienia i zwraca zgodnie z instrukcjami w głównym kodzie.
     * autor: 00000000000
     * **********/

    protected String tytulFilmu = "0";
    protected int liczbaWypozyczen = 0;

    public void setTytulFilmu(String tytulFilmu) {
        this.tytulFilmu = tytulFilmu;
    }

    public String getTytulFilmu() {
        return tytulFilmu;
    }

    public int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }

    public void wypozyczFilm(){
        liczbaWypozyczen++;
    }
}
