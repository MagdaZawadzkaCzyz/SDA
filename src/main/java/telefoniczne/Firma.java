package telefoniczne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
    @Getter
    @Setter
    @ToString
    public class Firma extends Wpis {
        private String nazwaFirmy;
        private String adres;
        private NrTelefoniczny nrTelefonu;
        public Firma() {
        }
        public Firma(String nazwaFirmy, String adres, NrTelefoniczny nrTelefonu) {
            this.nazwaFirmy = nazwaFirmy;
            this.adres = adres;
            this.nrTelefonu = nrTelefonu;
        }
        public String getNazwaFirmy() {
            return nazwaFirmy;
        }
        public String getAdres() {
            return adres;
        }
        public NrTelefoniczny getNrTelefonu() {
            return nrTelefonu;
        }
        @Override
        public String opis() {
            return "Dane kontaktowe firmy";
        }
    }

