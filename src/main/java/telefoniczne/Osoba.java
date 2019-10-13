package telefoniczne;

public class Osoba {

    private String imie;
    private String nazwisko;
    private String adres;
    private NrTelefoniczny nrTelefonu;

    public Osoba() {
    }

    public Osoba (String imie, String nazwisko, String adres, NrTelefoniczny nrTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.nrTelefonu = nrTelefonu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public NrTelefoniczny getNrTelefonu() {
        return nrTelefonu;
    }

    public String opis() {
        return "Dane kontaktowe osoby niebędącej firmą";
    }
}
